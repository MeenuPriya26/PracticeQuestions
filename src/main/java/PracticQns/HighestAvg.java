package PracticQns;

import java.util.*;

public class HighestAvg {
    public static void main(String[] args) {

        /*String student[][] = {{"jerry","65"}, {"bob","1"}, {"jerry","23"},{"jerry","23"}, {"jerry","100"},{"Eric","83"}};
        List<Integer> score = new ArrayList();

        Map<String, List<Integer>> map = new HashMap();
        for(int i = 0;i< student.length;i++){
            score.add(Integer.parseInt(student[i][1]));
            map.put(student[i][0], score);
    }



    List grade = new ArrayList();
        for(String key:map.keySet()) {
        score = map.get(key);
        int sum = 0;
        for(int num : score) {
        sum+=num;
        }
        int average = sum/score.size();
            System.out.println(average);
        grade.add(average);
        }

        Collections.sort(grade);

        System.out.println(grade.get(grade.size()-1));
        System.out.println(grade);*/


        /*String student[][] = {{"jerry","65"}, {"bob","1"}, {"jerry","23"},{"jerry","23"}, {"jerry","100"},{"Eric","83"}};
        Map<String, List<Integer>> map = new HashMap();
        double max_avg=0.0;
        int avg=0;
        String key = "";
        for(int i = 0;i();
            Integer score = Integer.parseInt(student[i][1]);
        if(map.containsKey(student[i][0])){
        { Integer sum = map.get(student[i][0]).get(0);
            Integer num = map.get(student[i][0]).get(1)+1;
            sum=sum+score;
            map.get(student[i][0]).set(0,sum);
            map.get(student[i][0]).set(1,num);

            avg =sum/score;
            if(avg>max_avg)
            {
                max_avg=avg;
                key=student[i][0];
            }
            else
            {
                List ar = new ArrayList();
                ar.add(score);
                ar.add(1);
                map.put(student[i][0], ar);
            }
        }

        System.out.println(map.get(key));

    }
*/


        String[][] scores = {{"Bob","85"},{"Mark","100"},{"Charles","63"},{"Mark","34"}};



        // This HashMap maps student name to their list of scores
        Map<String,List<Integer>> scoreMap = new HashMap<String,List<Integer>>();
        for(String[] score:scores) {
            String name = score[0];
            int currentScore =Integer.parseInt(score[1]);

            if(scoreMap.containsKey(name)) {
                List<Integer> scoreList = scoreMap.get(name);
                scoreList.add(currentScore);
                scoreMap.put(name, scoreList);
            }
            else {
                List<Integer> scoreList = new ArrayList<Integer>();
                scoreList.add(currentScore);
                scoreMap.put(name, scoreList);
            }
        }
        //scoreMap will be {Charles=[63], Bob=[85], Mark=[100, 34]}
        //After Map is formed i am iterating though all the values and finding the best average as below
        int bestAverage = 0;
        for(List<Integer> value:scoreMap.values()) {
            int sum = 0;
            int count = 0;
            for(int i:value) {
                sum+=i;
                count++;
            }
            int average = (int)Math.floor(sum/count);
            if(average>bestAverage)
                bestAverage = average;
        }
        System.out.println(bestAverage);
        Map<String,Integer> averageMap= new HashMap<>();
        for(Map.Entry<String,List<Integer>> entry :scoreMap.entrySet()){
            /*for(entry.getKey()){

            }*/
        }
}
}
