package example.third;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;


public class ThirdActivity extends Activity {

	int i=1;
	int j=1;
//	int k=1;
//	int l=1;
//	int m=1;
//	int n=1;
//	int o=1;
//	int p=1;
//	int q=1;
//	int r=1;
	int u=100;
	int t=200;
	int w=300;
	int x=400;
	int a;
	int b=1;
	int c=1;
	int d;
	int e=11;
	Button bx,br;
	EditText et;
	TextView tv1;
	TextView tv2;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b0;
	Button badd;
	Button bsub;
	Button beq;
	Button bmul;
	Button bdiv;
	int num1,num2,num3,num4;
	
	String s="Type a number and then delete ! ";
	String s0="";
	String s1[]={"1","2","3","4","5","6","7","8","9","0","+","-","*","/"};
	String s2="";
	String s3="";
	String s4="";
	String s5="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		//num3=num1+num2;
	//	tv1.setText(Integer.toString(num3));
		
	    bx=(Button) findViewById(R.id.bx);
	    br=(Button) findViewById(R.id.br);
	    b1=(Button) findViewById(R.id.b1);
	    b2=(Button) findViewById(R.id.b2);
	    b3=(Button) findViewById(R.id.b3);
	    b4=(Button) findViewById(R.id.b4);
	    b5=(Button) findViewById(R.id.b5);
	    b6=(Button) findViewById(R.id.b6);
	    b7=(Button) findViewById(R.id.b7);
	    b8=(Button) findViewById(R.id.b8);
	    b9=(Button) findViewById(R.id.b9);
	    b0=(Button) findViewById(R.id.b0);
	    badd=(Button) findViewById(R.id.badd);
	    bsub=(Button) findViewById(R.id.bsub);
	    bmul=(Button) findViewById(R.id.bmul);
	    bdiv=(Button) findViewById(R.id.bdiv);
	    beq=(Button) findViewById(R.id.beq);
	    et=(EditText) findViewById(R.id.edit);
	    tv1=(TextView) findViewById(R.id.tv1);
	    tv2=(TextView) findViewById(R.id.tv2);
	    
	    for(int z=1;z<=100;z++){
	    br.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//	Intent i=new Intent(ThirdActivity.this,ThirdActivity.class);
				Intent i=new Intent("example.third.THIRDACTIVITY");
				startActivity(i);
				onBackPressed();
				onStop();
				
				
			}
			
			
		});
	    bx.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
			//	tv1.setText(et.getText());
				
			//	s=et.getText().toString();
			//	tv1.setText(s);
			//	if(d== 1 | d== 2 | d==3 | d==4 | d==5 | d==6 |d==7 |d==8 | d==9 |d==0 ){
				
				//	num1=num1-d;
				if(d=='+'){
					
					et.setText(s3);
				//	num1=Integer.parseInt(s3);
					s0=s3;
					i=1;
					b=1;
					d=10;
				}
				else if(d=='-'){
					
					et.setText(s3);
				//	num1=Integer.parseInt(s3);
					s0=s3;
					i=1;
					b=1;
					d=10;
				}
				
				else if(d=='*'){
					
					et.setText(s3);
				//	num1=Integer.parseInt(s3);
					s0=s3;
					i=1;
					b=1;
					d=10;
				}
				
				else if(d=='/'){
					
					et.setText(s3);
				//	num1=Integer.parseInt(s3);
					s0=s3;
					i=1;
					b=1;
					d=10;
				}
				
			
				else{
					num1=num1/10;
					
					et.setText(Integer.toString(num1));
					s0=Integer.toString(num1);
					
				}
				if(e=='+'){
					
					et.setText(s4);
				//	num1=Integer.parseInt(s3);
					s0=s4;
					i=1;
					b=1;
					e=10;
				}
				else if(e=='-'){
					
					et.setText(s4);
				//	num1=Integer.parseInt(s3);
					s0=s4;
					i=2;
					b=2;
					e=10;
				}
				
				else if(e=='*'){
					
					et.setText(s4);
				//	num1=Integer.parseInt(s3);
					s0=s4;
					i=2;
					b=2;
					e=10;
				}
				
				else if(e=='/'){
					
					et.setText(s4);
				//	num1=Integer.parseInt(s3);
					s0=s4;
					i=2;
					b=2;
					e=10;
				}
				
			
				else if(e!=11){
					num2=num2/10;
					
					et.setText(Integer.toString(num2));
					
				//	et.setText(Integer.toString(num2));
				//	s0=Integer.toString(num2);
					
				}
			
				
		//		int a=s.length();
				//tv2.setText(a);
	//			for(int i=0;i<a-2;i++){
	//				tv.setText(s.charAt(i));
	//			}
	//			if(e== 1 | e== 2 | e==3 | e==4 | e==5 | e==6 |e==7 |e==8 | e==9 ){
		//			num2=num2-e;
			//		num2=num2/10;
				//	
					//et.setText(Integer.toString(num2));
				//	s0=Integer.toString(num2);
			//	}
				
				
			
			}
		});
	    
	    
	    
	    b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
					
				
				s0=s0+s1[0];
				et.setText(s0);
				num1=num1*10+1;
				
				num1=Integer.parseInt(s0);
				if(c==2){
				num2=num1;
				s2=Integer.toString(num2);
				s0=s0+s2;
				et.setText(s0);
				c=2;
				
				}
		//		b=2;
		//		c=1;
				d=1;
				}
			//	else if(j==1){
				//	s0=s0+s1[0];
				//	num2=Integer.parseInt("1");
				//	et.setText(s0);
				//	j=2;
		//			num2=Integer.parseInt("2");
				//	}
					else{
						e=1;
						et.setText("1");
						num2=num2*10+1;
						et.setText(Integer.toString(num2));
						
						
			//			num2=Integer.parseInt("s2");
			//			num2=Integer.parseInt("2");			
			//			num2=Integer.parseInt("2"+"2");
					}
				
				
				
			}
		});
	    
	    b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
			
				if(b==1 ){
					
					s2="2";
					s0=s0+s1[1];
					//
					et.setText(s0);
					num1=num1*10+2;
					num1=Integer.parseInt(s0);
					d=2;
				//	b=2;
				//	c=1;
				}
				else{
		//			if(c==1){
		//			num2=1;
		//			s2="2";
		//			s0=s0+s2;
		//			c=2;
		//			}
					e=2;
					et.setText("2");
					num2=num2*10+2;
		//			if(c==2){
		//				num1=num2;
		//				
		//				s0=s0+s2;
						
			//		}
					
					et.setText(Integer.toString(num2));
					
					
					
		//			num2=Integer.parseInt("s2");
		//			num2=Integer.parseInt("2");			
		//			num2=Integer.parseInt("2"+"2");
				//	if(c==1){
				//		num2=num1;
				//		s2=Integer.toString(num2);
				//		s0=s0+s2;
				//		et.setText(s0);
				//		c=2;
				//		}
				}
					
			//		b=2;
			//		c=1;
			//		}
	//		else	if(j==1){
		//		s0=s0+s1[1];
		//		num2=Integer.parseInt("2");
		//		et.setText(s0);
		//		j=2;
	//			num2=Integer.parseInt("2");
		//		}
				
			}
		});
	    
	    
	    b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[2];
				num1=num1*10+3;
				num1=Integer.parseInt(s0);
				et.setText(s0);
			//	b=2;
				d=3;
				}   
				else{
					e=3;
					
					et.setText("3");
					num2=num2*10+3;
					et.setText(Integer.toString(num2));
					
					
				//	num2=Integer.parseInt("3");
					
				}
					

			}
		});
	    b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[3];
				num1=num1*10+4;
				
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=4;
		//		b=2;
				}
				else{
					e=4;
					et.setText("4");
					num2=num2*10+4;
					et.setText(Integer.toString(num2));
				//	num2=Integer.parseInt("4");
				}
				}
		});
	    b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[4];
				num1=num1*10+5;
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=5;
		//		b=2;
				}
				else{
					e=5;
					et.setText("5");
					num2=num2*10+5;
					et.setText(Integer.toString(num2));
			//		num2=Integer.parseInt("5");
				}
			}
		});
	    b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[5];
				num1=num1*10+6;
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=6;
		//		b=2;
				}
			else{
				e=6;
				et.setText("6");
				num2=num2*10+6;
				et.setText(Integer.toString(num2));
		//		num2=Integer.parseInt("6");
			}}
		});
	    b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[6];
				num1=num1*10+7;
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=7;
			//	b=2;
				}
				else{
					e=7;
					et.setText("7");
					num2=num2*10+7;
					et.setText(Integer.toString(num2));
		//			num2=Integer.parseInt("7");
				}
			}
		});
	    b8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[7];
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=8;
		//		b=2;
			}
				else{
					e=8;
					et.setText("8");
					num2=num2*10+8;
					et.setText(Integer.toString(num2));
			//		num2=Integer.parseInt("8");
				}
				}
			
		});
	    b9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				s0=s0+s1[8];
				if(b==1){
					num1=num1*10+9;
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=9;
			//	b=2;
				}
				else{
					e=9;
					et.setText("9");
					num2=num2*10+9;
					et.setText(Integer.toString(num2));
			//		num2=Integer.parseInt("9");
				}
			}
		});
	    b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(b==1){
				s0=s0+s1[9];
				num1=num1*10+0;
				num1=Integer.parseInt(s0);
				et.setText(s0);
				d=0;
			//	b=2;
				}
				else{
					e=0;
					et.setText("0");
					num2=num2*10+0;
					et.setText(Integer.toString(num2));
			//		num2=Integer.parseInt("0");
				}
			}
		});
	    beq.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(a==u){
				num3=num1+num2;
				
			//	tv2.setText("hi");
				num1=num3;
				num2=0;
				tv1.setText(Integer.toString(num3));
		//		et.setText(Integer.toString(num3));
				}
				if(a==w){
					num3=num1-num2;
					num1=num3;
					num2=0;
					tv1.setText(Integer.toString(num3));
			//		et.setText(Integer.toString(num3));
				}
				if(a==t){
					num3=num1*num2;
					num1=num3;
					num2=0;
					tv1.setText(Integer.toString(num3));
			//		et.setText(Integer.toString(num3));
				}
				if(a==x){
					num3=num1/num2;
			//		s5='+';
			//		num4=num1*num2;
					num1=num3;
					num2=0;
					tv1.setText(Integer.toString(num3));
			//		et.setText(Integer.toString(num3));
				}
				
				
				
			}
		});
	    
	    badd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				
				if(i==1){
				b=2;
				s3=s0;
				s0=s0+s1[10];
				
				et.setText(s0);
		//		if(c==3){
		//		num1=num2;
		//		s0=s0+s2;
		//		}
		//		num2=0;
				i=2;
				u++;
				a=u;
				d='+';
				
				}
				else
				{
					et.setText(Integer.toString(num3)+"+");
					u++;
					a=u;
					
				}
				
			}
		});
	    
	    bsub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(i==1){
					b=2;
					s3=s0;
				s0=s0+s1[11];
				et.setText(s0);
				i=2;
				w++;
				a=w;
				d='-';
				
				
				}
				else
				{
					et.setText(Integer.toString(num3)+"-");
					w++;
					a=w;
					
					
					
				}
				
			}
		});
	    
	    bmul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				if(i==1){
					b=2;
					s3=s0;
				s0=s0+s1[12];
				et.setText(s0);
				i=2;
				t++;
				a=t;
				d='*';
				
				
				}
				else
				{
					et.setText(Integer.toString(num3)+"*");
					t++;
					a=t;
					
					
					
				}
				
			}
		});

	bdiv.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
		// TODO Auto-generated method stub
		if(i==1){
			b=2;
			s3=s0;
		s0=s0+s1[13];
		et.setText(s0);
		i=2;
		x++;
		a=x;
		d='/';
		
		
		}
		else
		{
			et.setText(Integer.toString(num3)+"/");
			x++;
			a=x;
			
			
			
		}
		
	}
});
	    	
	    
	  
	    }
	    
	}
}

	
