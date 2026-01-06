class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies)
        {
            if (candy > max)
            {
                max = candy;
            }
        }
        for (int i=0; i<candies.length; i++)
        {
            if (candies[i] + extraCandies >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int children = sc.nextInt();
        int[] candy = new int[children];
        for (int i=0; i<children; i++)
        {
            candy[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        List<Boolean> ans = kidsWithCandies(candy, extraCandies) ;
        for (int i=0; i<children; i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
