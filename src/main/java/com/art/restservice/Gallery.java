package com.art.restservice;


/**
 * Represents a collection of art pieces.
 */
public final class Gallery {


    /**
     * Don't let anyone instantiate this class.
     */
    private Gallery() {};


    /**
     * Represents all pieces in this gallery.
     */
    public static final ArtPiece[] pieces = new ArtPiece[]{
            new ArtPiece("Woman Troubles",
                    "https://drive.google.com/file/d/1NnSn1foyMcWZoy9ale7D4OHuo1uC47bX/view?usp=sharing", 0),
            new ArtPiece("Womanhood",
                    "https://drive.google.com/file/d/1V3dv6EH7-mLeiHp-O_q15ri1OK87jXFW/view?usp=sharing", 1),
            new ArtPiece("Trusting You",
                    "https://drive.google.com/file/d/1KRpW0jXSntAHbf_tmgwnk-g5P0VOv-s3/view?usp=sharing", 2),
            new ArtPiece("Through",
                    "https://drive.google.com/file/d/1H-9A8wUdZdlBfW86OI1XxUpChs7nf2Uc/view?usp=sharing", 3),
            new ArtPiece("The Eye",
                    "https://drive.google.com/file/d/1t1ZE9MciyvV5NsV8WFcGBULUQYC9oidG/view?usp=sharing", 4),
            new ArtPiece("The Ear",
                    "https://drive.google.com/file/d/16Ar2yo4k1MjN98n7oXZWkWLBhIQAKb6-/view?usp=sharing", 5),
            new ArtPiece("Still-Life",
                    "https://drive.google.com/file/d/1HI48hwxxGyY5kxoAM37cp1zuCFl7mGB2/view?usp=sharing", 6),
            new ArtPiece("Self Portrait 2020",
                    "https://drive.google.com/file/d/10B01CJGR74xeZ0wAd4FOq4HGdx6tI_XE/view?usp=sharing", 7),
            new ArtPiece("Little Girl",
                    "https://drive.google.com/file/d/17Uar_Zl0hSDIiycfYwsIbISWy1gYyDL4/view?usp=sharing", 8),
            new ArtPiece("July",
                    "https://drive.google.com/file/d/17nejewSV899Z2dfdQc_qAOAHmBLzgdnN/view?usp=sharing", 9),
            new ArtPiece("Hands",
                    "https://drive.google.com/file/d/1f53zJ7QEPtm22Jh60yZk0Mx1TRGyM2-f/view?usp=sharing", 10),
            new ArtPiece("For Rachel",
                    "https://drive.google.com/file/d/1oTi5ROSEkCk0OLpM3-KswX5jX4B4KKG9/view?usp=sharing", 11),
            new ArtPiece("All Over Now",
                    "https://drive.google.com/file/d/1kE8eLoSmVD8GixzKHDv9KRsGYJuYuNZJ/view?usp=sharing", 12)
    };


    public static final int numPieces = pieces.length;




}
