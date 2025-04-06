import java.util.*;

public class BalanceSheet {
    Map<User,List<Pair>> balanceMap;

    BalanceSheet(){
        balanceMap=new HashMap<>();
    }

    public void addBalance(User payedByUser, List<Split> splitDetails){
        List<Pair> list=new ArrayList<>();
        for(Split split: splitDetails){
            int amount=split.amount;
            String owedUserId=split.user.userId;

            if(owedUserId!=payedByUser.userId){

                Pair p = new Pair(owedUserId,amount);
                
                if(!balanceMap.containsKey(payedByUser))
                {
                    list.add(p);
                    balanceMap.put(payedByUser,list);
                }
                else
                {
                    List<Pair> alreadyExistingList= balanceMap.get(payedByUser);
                    alreadyExistingList.add(p);
                    balanceMap.put(payedByUser,alreadyExistingList);
                }
            }
        }
    }

    public void showBalance(User user){
        if(!balanceMap.containsKey(user)){
            System.out.println("This user has not made expense as of now");
        }
        else
        {
            List<Pair> balances=balanceMap.get(user);
            for(Pair p:balances){
                System.out.println(p.userId+" owes "+p.amount);
            }
        }
    }

}
