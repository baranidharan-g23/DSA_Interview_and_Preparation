class Solution {
    public String defangIPaddr(String address) {
        int length = address.length();
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<length;i++)
        {
            if(address.charAt(i)=='.')
            {
                builder.append('[');
                builder.append('.');
                builder.append(']');
            }
            else
            {
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
}