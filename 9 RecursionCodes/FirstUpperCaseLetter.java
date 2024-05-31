class FirstUpperCaseLetter {
    static char first(String str)
    {
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        return 0;
    }
    public static void main(String args[])
    {
        String str = "poKemon";
        char res = first(str);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println(res);
    }
}