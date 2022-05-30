class GFG {
	
	static int NO_OF_CHARS = 256;
	static int getNextState(char[] pat, int M,
							int state, int x)
	{
        System.out.print("ns 1 ");
		if(state < M && x == pat[state]){
            System.out.print("ns 13 ");
            return state + 1;
        }
	
        System.out.print("ns 2 ");

		int ns, i;

		for (ns = state; ns > 0 && System.out.printf("ns 3\n")!=null ; ns--)
		{
            System.out.print("ns 4 ");
			if (pat[ns-1] == x)
			{
                System.out.print("ns 5 ");
				for (i = 0;System.out.printf("ns 6\n")!=null && i < ns-1 ; i++){
                    System.out.print("ns 7 ");
					if (pat[i] != pat[state-ns+1+i])
						break;
                    else
                        System.out.print("ns 11 ");
                }
                System.out.print("ns 8 ");
                if (i == ns-1){
                    System.out.print("ns 9 ");
                    return ns;
                }
			}
            System.out.print("ns 10 ");
		}
        System.out.print("ns 3 ");

        System.out.print("ns 12 ");
		return 0;
	}

    static void computeTF(char[] pat, int M, int TF[][])
	{
		int state, x;
        System.out.print("1 ");
		for (state = 0;System.out.printf("2 ")!=null && state <= M; ++state){
            System.out.print("10 ");
			for (x = 0 ;System.out.printf("11 ")!=null && x < NO_OF_CHARS; ++x){
				TF[state][x] = getNextState(pat, M, state, x);
                System.out.print("13 ");
                System.out.print("14 ");
            }
            System.out.print("12 ");
        }
	}

	static void search(char[] pat, char[] txt)
	{
		int M = pat.length;
		int N = txt.length;

		int[][] TF = new int[M+1][NO_OF_CHARS];

		computeTF(pat, M, TF);

        System.out.print("3 ");

		int i, state = 0;

        System.out.print("4 ");
		for (i = 0;System.out.printf("5 ")!=null && i < N; i++)
		{
			state = TF[state][txt[i]];
            System.out.print("6 ");
			if (state == M){
				System.out.print("Pattern found " + "at index " + (i-M+1) + " ");
                System.out.print("7 ");
            }
            System.out.print("8 ");
		}
        System.out.print("9 ");
	}

	public static void main(String[] args)
	{
        char[] pat = "abbb".toCharArray();
        char[] text = "abbb".toCharArray();
        search(pat,text);
	}
}
