class StringBufferClass1{
	public static void main(String args[]){
		char ArrKar[]={'C','O','R','E',' ','J','A','V','A'};
        StringBuffer sb = new StringBuffer();

        for(int I=0;I<ArrKar.length;I++)
                {
			sb.append(ArrKar[I]);
		}

		System.out.println("sb  = "+sb);
		System.out.println("Panjang = "+sb.length());


	}
}
