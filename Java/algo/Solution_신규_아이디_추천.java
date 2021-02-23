public class Solution_신규_아이디_추천 {
    class Solution {
        public String solution(String new_id) {
            String answer = "";
            //1단계. 소문자 변경
            String str = new_id.toLowerCase();
            String id = "";
            //2단계. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 나머지 제거
            for(int i =0; i<str.length();i++){
                char ch = str.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    id+= String.valueOf(ch);
                }else if(ch >='0' && ch <= '9'){
                    id+= String.valueOf(ch);
                }else if(ch =='-'|| ch=='_'||ch=='.'){
                    id+= String.valueOf(ch);
                }
            }
            //3단계 . 2개 이상 => 하나로
            for(int i=0; i< id.length();i++){
                if(id.charAt(i)=='.'){
                    int j = i+1;
                    String dot = ".";
                    while(j!=id.length() &&id.charAt(j)=='.'){
                        dot +=".";
                        j++;
                    }
                    if(dot.length()>1){
                        id=id.replace(dot, ".");
                    }
                }
            }
            //4단계 첫번째, 마지막 "." 제거
            if(id.startsWith(".")){
                id= id.substring(1, id.length());
            }else if(id.endsWith(".")){
                id= id.substring(0,id.length()-1);
            }
            //5단계 빈문자열일 경우 a 대입
            if(id.length()==0){
                id += "a";
            }
            //6단계 길이가 16자 이상일 경우 15자로 자르고 끝 문자열이 "."일경우 제거
            if(id.length()>=16){
                id= id.substring(0,15);
            }
            if(id.endsWith(".")){
                id= id.substring(0, id.length()-1);
            }
            //7단계 길이가 2이하라면, 문자길이가 3까지 반복해서 붙임
            String last = id.charAt(id.length()-1)+"";
            if(id.length()==2){
                id= id+last;
            }else if(id.length()==1){
                id= id+last+last;
            }
            System.out.println(id);
            return id;
        }
    }
}
