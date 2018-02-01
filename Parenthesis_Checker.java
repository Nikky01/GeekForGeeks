package com.geek;

import java.util.*;

class Parenthesis_Checker{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  for(int ii=0; ii<t; ii++){
   String str = sc.next();
   Stack <Character> stack = new Stack<Character>();
   int flag=1;
   Map<Character, Character> lb = new HashMap<>();
   lb.put(')', '(');
   lb.put(']', '[');
   lb.put('}', '{');
   Set<Character> rb = new HashSet<>();
   rb.add(')');
   rb.add(']');
   rb.add('}');
   for(int i=0; i<str.length(); i++){
    char br = str.charAt(i);
    if (rb.contains(br)){
     if (stack.empty())   
      flag=0;
     else if (stack.peek()!=lb.get(br))
      flag=0;
     else
      stack.pop();
    }
    else{
     stack.push(br);
    }
   }
   if (!stack.empty()){
    flag=0;
   }
   System.out.println(flag==1 ? "balanced" : "not balanced");
  }
 }
}
