class Solution {
    fun isValid(s: String): Boolean {
    val stack= Stack<Char>()
        val str=s.toCharArray()
        for(i in str.indices){
            if(str[i]=='('){
                stack.push(s[i])
            }
            else if(s[i]=='['){
                stack.push(s[i])
            }
            else if (s[i]=='{'){
                stack.push(s[i])
            }else if (s[i]=='}'){
                if (stack.isNotEmpty() && stack.peek()=='{'){
                    stack.pop()
                }
                else return false
            }
            else if (s[i]==']'){
                if (stack.isNotEmpty() && stack.peek()=='['){
                    stack.pop()
                }
                else return false
            }
            else{
                if (stack.isNotEmpty() && stack.peek()=='('){
                    stack.pop()
                }
                else return false
            }

        }
        return stack.isEmpty()
    }
}
