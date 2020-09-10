package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
            public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
                List<List<Integer>> result=new ArrayList<>();
                Queue<List<Integer>> queue= new LinkedList<>();
                queue.add(Arrays.asList(0));
                int goal=graph.length-1;

                while(!queue.isEmpty()){

                    List<Integer> path=queue.poll();
                    int last=path.get(path.size()-1);

                    if(goal==last){
                        result.add(new ArrayList<>(path));
                    }
                    else {int[] neighbors=graph[last];
                        for(int neighbor:neighbors){
                            List<Integer> list=new ArrayList<>(path);//adding the list of the paths
                            list.add(neighbor);
                            queue.add(list);//the start node is now considered to be the last node of theprevious path which was not the goal but has a path to the goal.
                        }
                    }
                }
                System.out.println(result);
            }
        }







    }



