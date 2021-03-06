package shitDesign.gfx;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;

import shitDesign.shitDesignGame;

public class Assets {
	//stating all buffered images as their own objects here
	public static BufferedImage a1, a2, a3, a4, a5, a6, b1, b2, b3, b4, b5, b6, c1, c2, c3, c4, c5, c6, d1, d2, d3, d4,
			d5, d6, e1, e2, e3, e4, e5, e6, f1, f2, f3, f4, f5, f6, g1, g2, g3, g4, g5, g6, h1, h2, h3, h4, h5, h6, i1,
			i2, i3, i4, i5, i6, j1, j2, j3, j4, j5, j6, k1, k2, k3, k4, k5, k6, l1, l2, l3, l4, l5, l6, m1, m2, m3, m4,
			m5, m6, n1, n2, n3, n4, n5, n6, o1, o2, o3, o4, o5, o6, p1, p2, p3, p4, p5, p6, q1, q2, q3, q4, q5, q6, r1,
			r2, r3, r4, r5, r6, s1, s2, s3, s4, s5, s6, t1, t2, t3, t4, t5, t6, u1, u2, u3, u4, u5, u6, v1, v2, v3, v4,
			v5, v6, w1, w2, w3, w4, w5, w6, x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6, z1, z2, z3, z4, z5, z6;
	//size for keeping x axis starting at 0
	private static int sizeIncrease = 0;
	//width and height of each letter
	private final static int width = 100, height = 100;
	//creates a buffered image list for each pair of letters
	public static ArrayList<BufferedImage> alist, blist, clist, dlist, elist, flist, glist, hlist, ilist, jlist, klist, llist,
			mlist, nlist, olist, plist, qlist, rlist, slist, tlist, ulist, vlist, wlist, xlist, ylist, zlist;
	//maps the character to a buffered image arraylist
	public static LinkedHashMap<String, ArrayList<BufferedImage>> sizeChange;
	//maps that buffered image list to an integer
	public static HashMap<ArrayList<BufferedImage>, Integer> randomizerSelection;
	//maps that buffered image list to an integer
	public static HashMap<ArrayList<BufferedImage>, Integer> randomizerSize;
	//creates an arraylist for which letter we are currently on
	public static ArrayList<Integer> currentLetterSelection = new ArrayList<Integer>();
	//takes the random integer to map to buffered image above to change its size
	public static ArrayList<Integer> currentLetterSize= new ArrayList<Integer>();
	//additive number for how big the x axis is (used for debugging shit)
	public static ArrayList<Integer> sizeIncreaseArray= new ArrayList<Integer>();
//dont even bother trying to understand this...

	public static void init() {
		//takes sprite sheet and loads it
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		//declaring hashmaps and arraylists
		sizeChange = new LinkedHashMap<String, ArrayList<BufferedImage>>();
		randomizerSelection = new HashMap<ArrayList<BufferedImage>, Integer>();
		randomizerSize = new HashMap<ArrayList<BufferedImage>, Integer>();
		alist = new ArrayList<BufferedImage>();
		blist = new ArrayList<BufferedImage>();
		clist = new ArrayList<BufferedImage>();
		dlist = new ArrayList<BufferedImage>();
		elist = new ArrayList<BufferedImage>();
		flist = new ArrayList<BufferedImage>();
		glist = new ArrayList<BufferedImage>();
		hlist = new ArrayList<BufferedImage>();
		ilist = new ArrayList<BufferedImage>();
		jlist = new ArrayList<BufferedImage>();
		klist = new ArrayList<BufferedImage>();
		llist = new ArrayList<BufferedImage>();
		mlist = new ArrayList<BufferedImage>();
		nlist = new ArrayList<BufferedImage>();
		olist = new ArrayList<BufferedImage>();
		plist = new ArrayList<BufferedImage>();
		qlist = new ArrayList<BufferedImage>();
		rlist = new ArrayList<BufferedImage>();
		slist = new ArrayList<BufferedImage>();
		tlist = new ArrayList<BufferedImage>();
		ulist = new ArrayList<BufferedImage>();
		vlist = new ArrayList<BufferedImage>();
		wlist = new ArrayList<BufferedImage>();
		xlist = new ArrayList<BufferedImage>();
		ylist = new ArrayList<BufferedImage>();
		zlist = new ArrayList<BufferedImage>();
		//puts letters and buffered image lists into hash map
		sizeChange.put("a", alist);
		sizeChange.put("b", blist);
		sizeChange.put("c", clist);
		sizeChange.put("d", dlist);
		sizeChange.put("e", elist);
		sizeChange.put("f", flist);
		sizeChange.put("g", glist);
		sizeChange.put("h", hlist);
		sizeChange.put("i", ilist);
		sizeChange.put("j", jlist);
		sizeChange.put("k", klist);
		sizeChange.put("l", llist);
		sizeChange.put("m", mlist);
		sizeChange.put("n", nlist);
		sizeChange.put("o", olist);
		sizeChange.put("p", plist);
		sizeChange.put("q", qlist);
		sizeChange.put("r", rlist);
		sizeChange.put("s", slist);
		sizeChange.put("t", tlist);
		sizeChange.put("u", ulist);
		sizeChange.put("v", vlist);
		sizeChange.put("w", wlist);
		sizeChange.put("x", xlist);
		sizeChange.put("y", ylist);
		sizeChange.put("z", zlist);
		//creates each object then adds them to the array list for each
		alist.add(a1 = sheet.crop(0, 0, width, height));
		alist.add(a2 = sheet.crop((width) - 1, 0, width, height));
		alist.add(a3 = sheet.crop((width * 2) - 1, 0, width, height));
		alist.add(a4 = sheet.crop((width * 3) - 1, 0, width, height));
		alist.add(a5 = sheet.crop((width * 4) - 1, 0, width, height));
		alist.add(a6 = sheet.crop((width * 5) - 1, 0, width, height));
		blist.add(b1 = sheet.crop(0, height, width + 1, height));
		blist.add(b2 = sheet.crop((width) - 1, height, width + 1, height));
		blist.add(b3 = sheet.crop((width * 2) - 1, height, width + 1, height));
		blist.add(b4 = sheet.crop((width * 3) - 1, height, width + 1, height));
		blist.add(b5 = sheet.crop((width * 4) - 1, height, width + 1, height));
		blist.add(b6 = sheet.crop((width * 5) - 1, height, width + 1, height));
		clist.add(c1 = sheet.crop(0, height * 2, width, height));
		clist.add(c2 = sheet.crop((width) - 1, height * 2, width, height));
		clist.add(c3 = sheet.crop((width * 2) - 1, height * 2, width, height));
		clist.add(c4 = sheet.crop((width * 3) - 1, height * 2, width, height));
		clist.add(c5 = sheet.crop((width * 4) - 1, height * 2, width, height));
		clist.add(c6 = sheet.crop((width * 5) - 1, height * 2, width, height));
		dlist.add(d1 = sheet.crop(0, height * 3, width, height));
		dlist.add(d2 = sheet.crop((width) - 1, height * 3, width, height));
		dlist.add(d3 = sheet.crop((width * 2) - 1, height * 3, width, height));
		dlist.add(d4 = sheet.crop((width * 3) - 1, height * 3, width, height));
		dlist.add(d5 = sheet.crop((width * 4) - 1, height * 3, width, height));
		dlist.add(d6 = sheet.crop((width * 5) - 1, height * 3, width, height));
		elist.add(e1 = sheet.crop(0, height * 4, width, height));
		elist.add(e2 = sheet.crop((width) - 1, height * 4, width, height));
		elist.add(e3 = sheet.crop((width * 2) - 1, height * 4, width, height));
		elist.add(e4 = sheet.crop((width * 3) - 1, height * 4, width, height));
		elist.add(e5 = sheet.crop((width * 4) - 1, height * 4, width, height));
		elist.add(e6 = sheet.crop((width * 5) - 1, height * 4, width, height));
		flist.add(f1 = sheet.crop(0, height * 5, width, height));
		flist.add(f2 = sheet.crop((width) - 1, height * 5, width, height));
		flist.add(f3 = sheet.crop((width * 2) - 1, height * 5, width, height));
		flist.add(f4 = sheet.crop((width * 3) - 1, height * 5, width, height));
		flist.add(f5 = sheet.crop((width * 4) - 1, height * 5, width, height));
		flist.add(f6 = sheet.crop((width * 5) - 1, height * 5, width, height));
		glist.add(g1 = sheet.crop(0, height * 6, width, height));
		glist.add(g2 = sheet.crop((width) - 1, height * 6, width, height));
		glist.add(g3 = sheet.crop((width * 2) - 1, height * 6, width, height));
		glist.add(g4 = sheet.crop((width * 3) - 1, height * 6, width, height));
		glist.add(g5 = sheet.crop((width * 4) - 1, height * 6, width, height));
		glist.add(g6 = sheet.crop((width * 5) - 1, height * 6, width, height));
		hlist.add(h1 = sheet.crop(0, height * 7, width, height));
		hlist.add(h2 = sheet.crop((width) - 1, height * 7, width, height));
		hlist.add(h3 = sheet.crop((width * 2) - 1, height * 7, width, height));
		hlist.add(h4 = sheet.crop((width * 3) - 1, height * 7, width, height));
		hlist.add(h5 = sheet.crop((width * 4) - 1, height * 7, width, height));
		hlist.add(h6 = sheet.crop((width * 5) - 1, height * 7, width, height));
		ilist.add(i1 = sheet.crop(0, height * 8, width, height));
		ilist.add(i2 = sheet.crop((width) - 1, height * 8, width, height));
		ilist.add(i3 = sheet.crop((width * 2) - 1, height * 8, width, height));
		ilist.add(i4 = sheet.crop((width * 3) - 1, height * 8, width, height));
		ilist.add(i5 = sheet.crop((width * 4) - 1, height * 8, width, height));
		ilist.add(i6 = sheet.crop((width * 5) - 1, height * 8, width, height));
		jlist.add(j1 = sheet.crop(0, height * 9, width, height));
		jlist.add(j2 = sheet.crop((width) - 1, height * 9, width, height));
		jlist.add(j3 = sheet.crop((width * 2) - 1, height * 9, width, height));
		jlist.add(j4 = sheet.crop((width * 3) - 1, height * 9, width, height));
		jlist.add(j5 = sheet.crop((width * 4) - 1, height * 9, width, height));
		jlist.add(j6 = sheet.crop((width * 5) - 1, height * 9, width, height));
		klist.add(k1 = sheet.crop(0, height * 10, width, height));
		klist.add(k2 = sheet.crop((width) - 1, height * 10, width, height));
		klist.add(k3 = sheet.crop((width * 2) - 1, height * 10, width, height));
		klist.add(k4 = sheet.crop((width * 3) - 1, height * 10, width, height));
		klist.add(k5 = sheet.crop((width * 4) - 1, height * 10, width, height));
		klist.add(k6 = sheet.crop((width * 5) - 1, height * 10, width, height));
		llist.add(l1 = sheet.crop(0, height * 11, width, height));
		llist.add(l2 = sheet.crop((width) - 1, height * 11, width, height));
		llist.add(l3 = sheet.crop((width * 2) - 1, height * 11, width, height));
		llist.add(l4 = sheet.crop((width * 3) - 1, height * 11, width, height));
		llist.add(l5 = sheet.crop((width * 4) - 1, height * 11, width, height));
		llist.add(l6 = sheet.crop((width * 5) - 1, height * 11, width, height));
		mlist.add(m1 = sheet.crop(0, height * 12, width, height));
		mlist.add(m2 = sheet.crop((width) - 1, height * 12, width, height));
		mlist.add(m3 = sheet.crop((width * 2) - 1, height * 12, width, height));
		mlist.add(m4 = sheet.crop((width * 3) - 1, height * 12, width, height));
		mlist.add(m5 = sheet.crop((width * 4) - 1, height * 12, width, height));
		mlist.add(m6 = sheet.crop((width * 5) - 1, height * 12, width, height));
		nlist.add(n1 = sheet.crop(0, height * 13, width, height));
		nlist.add(n2 = sheet.crop((width) - 1, height * 13, width, height));
		nlist.add(n3 = sheet.crop((width * 2) - 1, height * 13, width, height));
		nlist.add(n4 = sheet.crop((width * 3) - 1, height * 13, width, height));
		nlist.add(n5 = sheet.crop((width * 4) - 1, height * 13, width, height));
		nlist.add(n6 = sheet.crop((width * 5) - 1, height * 13, width, height));
		olist.add(o1 = sheet.crop(0, height * 14, width, height));
		olist.add(o2 = sheet.crop((width) - 1, height * 14, width, height));
		olist.add(o3 = sheet.crop((width * 2) - 1, height * 14, width, height));
		olist.add(o4 = sheet.crop((width * 3) - 1, height * 14, width, height));
		olist.add(o5 = sheet.crop((width * 4) - 1, height * 14, width, height));
		olist.add(o6 = sheet.crop((width * 5) - 1, height * 14, width, height));
		plist.add(p1 = sheet.crop(0, height * 15, width, height));
		plist.add(p2 = sheet.crop((width) - 1, height * 15, width, height));
		plist.add(p3 = sheet.crop((width * 2) - 1, height * 15, width, height));
		plist.add(p4 = sheet.crop((width * 3) - 1, height * 15, width, height));
		plist.add(p5 = sheet.crop((width * 4) - 1, height * 15, width, height));
		plist.add(p6 = sheet.crop((width * 5) - 1, height * 15, width, height));
		qlist.add(q1 = sheet.crop(0, height * 16, width, height));
		qlist.add(q2 = sheet.crop((width) - 1, height * 16, width, height));
		qlist.add(q3 = sheet.crop((width * 2) - 1, height * 16, width, height));
		qlist.add(q4 = sheet.crop((width * 3) - 1, height * 16, width, height));
		qlist.add(q5 = sheet.crop((width * 4) - 1, height * 16, width, height));
		qlist.add(q6 = sheet.crop((width * 5) - 1, height * 16, width, height));
		rlist.add(r1 = sheet.crop(0, height * 17, width, height));
		rlist.add(r2 = sheet.crop((width) - 1, height * 17, width, height));
		rlist.add(r3 = sheet.crop((width * 2) - 1, height * 17, width, height));
		rlist.add(r4 = sheet.crop((width * 3) - 1, height * 17, width, height));
		rlist.add(r5 = sheet.crop((width * 4) - 1, height * 17, width, height));
		rlist.add(r6 = sheet.crop((width * 5) - 1, height * 17, width, height));
		slist.add(s1 = sheet.crop(0, height * 18, width, height));
		slist.add(s2 = sheet.crop((width) - 1, height * 18, width, height));
		slist.add(s3 = sheet.crop((width * 2) - 1, height * 18, width, height));
		slist.add(s4 = sheet.crop((width * 3) - 1, height * 18, width, height));
		slist.add(s5 = sheet.crop((width * 4) - 1, height * 18, width, height));
		slist.add(s6 = sheet.crop((width * 5) - 1, height * 18, width, height));
		tlist.add(t1 = sheet.crop(0, height * 19, width, height));
		tlist.add(t2 = sheet.crop((width) - 1, height * 19, width, height));
		tlist.add(t3 = sheet.crop((width * 2) - 1, height * 19, width, height));
		tlist.add(t4 = sheet.crop((width * 3) - 1, height * 19, width, height));
		tlist.add(t5 = sheet.crop((width * 4) - 1, height * 19, width, height));
		tlist.add(t6 = sheet.crop((width * 5) - 1, height * 19, width, height));
		ulist.add(u1 = sheet.crop(0, height * 20, width, height));
		ulist.add(u2 = sheet.crop((width) - 1, height * 20, width, height));
		ulist.add(u3 = sheet.crop((width * 2) - 1, height * 20, width, height));
		ulist.add(u4 = sheet.crop((width * 3) - 1, height * 20, width, height));
		ulist.add(u5 = sheet.crop((width * 4) - 1, height * 20, width, height));
		ulist.add(u6 = sheet.crop((width * 5) - 1, height * 20, width, height));
		vlist.add(v1 = sheet.crop(0, height * 21, width, height));
		vlist.add(v2 = sheet.crop((width) - 1, height * 21, width, height));
		vlist.add(v3 = sheet.crop((width * 2) - 1, height * 21, width, height));
		vlist.add(v4 = sheet.crop((width * 3) - 1, height * 21, width, height));
		vlist.add(v5 = sheet.crop((width * 4) - 1, height * 21, width, height));
		vlist.add(v6 = sheet.crop((width * 5) - 1, height * 21, width, height));
		wlist.add(w1 = sheet.crop(0, height * 22, width, height));
		wlist.add(w2 = sheet.crop((width) - 1, height * 22, width, height));
		wlist.add(w3 = sheet.crop((width * 2) - 1, height * 22, width, height));
		wlist.add(w4 = sheet.crop((width * 3) - 1, height * 22, width, height));
		wlist.add(w5 = sheet.crop((width * 4) - 1, height * 22, width, height));
		wlist.add(w6 = sheet.crop((width * 5) - 1, height * 22, width, height));
		xlist.add(x1 = sheet.crop(0, height * 23, width, height));
		xlist.add(x2 = sheet.crop((width) - 1, height * 23, width, height));
		xlist.add(x3 = sheet.crop((width * 2) - 1, height * 23, width, height));
		xlist.add(x4 = sheet.crop((width * 3) - 1, height * 23, width, height));
		xlist.add(x5 = sheet.crop((width * 4) - 1, height * 23, width, height));
		xlist.add(x6 = sheet.crop((width * 5) - 1, height * 23, width, height));
		ylist.add(y1 = sheet.crop(0, height * 24, width, height));
		ylist.add(y2 = sheet.crop((width) - 1, height * 24, width, height));
		ylist.add(y3 = sheet.crop((width * 2) - 1, height * 24, width, height));
		ylist.add(y4 = sheet.crop((width * 3) - 1, height * 24, width, height));
		ylist.add(y5 = sheet.crop((width * 4) - 1, height * 24, width, height));
		ylist.add(y6 = sheet.crop((width * 5) - 1, height * 24, width, height));
		zlist.add(z1 = sheet.crop(0, height * 25, width, height));
		zlist.add(z2 = sheet.crop((width) - 1, height * 25, width, height));
		zlist.add(z3 = sheet.crop((width * 2) - 1, height * 25, width, height));
		zlist.add(z4 = sheet.crop((width * 3) - 1, height * 25, width, height));
		zlist.add(z5 = sheet.crop((width * 4) - 1, height * 25, width, height));
		zlist.add(z6 = sheet.crop((width * 5) - 1, height * 25, width, height));
		//meat and bones of this shit
		//for loop to go through for the length of our array (any print statements here are for debugging)
		for (int i=0; i < shitDesignGame.p.length(); i++) {
			//takes it one letter at a time
			String currentLetter = String.valueOf(shitDesignGame.p.charAt(i));
			System.out.println(currentLetter + " currentLetter");
			//takes a random number from randomization 
			randomizerSelection.put(sizeChange.get(currentLetter), randomization.randomBufferedSelection());
			//maps the current letter to that random selection
			currentLetterSelection.add(randomizerSelection.get(sizeChange.get(currentLetter)));
			//takes a random size from the letter selection
			randomizerSize.put(sizeChange.get(currentLetter), randomization.randomSizeSelection());
			//maps the random size to the current letter
			currentLetterSize.add(randomizerSize.get(sizeChange.get(currentLetter)));
			System.out.println(currentLetterSelection + " currentLetterSelection");
			System.out.println(currentLetterSize + " currentLetterSize");
			//adds the size increase of the current letter to the size increase array
			sizeIncreaseArray.add(sizeIncrease);
			//adds the new size to size increase
			sizeIncrease += Assets.currentLetterSize.get(i);
			System.out.println(sizeIncreaseArray + " sizeIncreaseArray");
			//all this is used back in .visuals
		}
	}

}
