package InnerClasses;

class Outside {

	int aa = 10;
	private int x = 22;
	static int v = 999;

	class Inside {
		int a = 12;
		int b = 20;
		private int c = 22;

		public void m1() {
			// Outside o = new Outside();
			System.out.println(Outside.v);
		}

	}

	private class InsidePvt {
		int aa = 12;
		int bb = 20;
		private int cc = 22;

		private void mpPrivate() {
			int ap = 33;
			System.out.println(ap);
		}

	}

	static class InsideStatic {
		int a = 11;
		int b = 20;
		private int c = 282;

		public void mStatic() {
			Outside o = new Outside();
			System.out.println(o.aa);
		}
	}

	public static void main(String[] args) {

		Outside o = new Outside();
		Outside.Inside inner = o.new Inside();
		inner.m1();
		Outside.InsideStatic staticInner = new Outside.InsideStatic();
		System.out.println(o.aa + " " + inner.a + " " + staticInner.a);
		System.out.println(inner.c + "    " + o.x);

		Outside oo = new Outside();
		Outside.InsidePvt oi = o.new InsidePvt();
		System.out.println(oi.cc);
		oi.mpPrivate();

	}
}
