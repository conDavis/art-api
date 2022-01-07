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
            new ArtPiece("Feminine Expectations",
                    "https://drive.google.com/uc?id=1CAfHy1ZfHvRpYNG9O-kXADsPcOhTQUq-", 0),
            new ArtPiece("Womanhood",
                    "https://drive.google.com/uc?id=1xWd2eH0eMGXJOv4jaoGwLgwvls0e9fNd", 1),
            new ArtPiece("Trusting You",
                    "https://drive.google.com/uc?id=1d-LXD5d569vMgKmYf6awNaP_rz1wp27c", 2),
            new ArtPiece("Through",
                    "https://drive.google.com/uc?id=1nla49eH2WArQ3EQEKCGSSxbhUBov6Ii7", 3),
            new ArtPiece("The Eye",
                    "https://drive.google.com/uc?id=1VjDAQCi623ZG7w88m0vVhXObSCWyM8up", 4),
            new ArtPiece("The Ear",
                    "https://drive.google.com/uc?id=1dLJ4RlC2F_FdA4YazpMXPjXKemJtH3mm", 5),
            new ArtPiece("Still-Life",
                    "https://drive.google.com/uc?id=1ECLAZ5vPgd6UztFgojm0pNVh0h1EBQRD", 6),
            new ArtPiece("Self Portrait 2020",
                    "https://drive.google.com/uc?id=1L-e28HJnaDveW_i_F3A6ImUPZ_PSadmv", 7),
            new ArtPiece("Little Girl",
                    "https://drive.google.com/uc?id=1qfX92Jys9bMrqCQXLNzggVvmlfueAkpQ", 8),
            new ArtPiece("July",
                    "https://drive.google.com/uc?id=1lCGQt1TBrJuGO-zpl09eY7VDZ1Y3qURL", 9),
            new ArtPiece("Hands",
                    "https://drive.google.com/uc?id=1AVvrHETi1btq5t_eQYjGiTTDH_F9cPTX", 10),
            new ArtPiece("For Rachel",
                    "https://drive.google.com/uc?id=1UXQkDojMwatHs7pYIrSxeAg95w5KBmJd", 11),
            new ArtPiece("All Over Now",
                    "https://drive.google.com/uc?id=1G9KcpaI4zRBPc7P6nSbFCAN4pfWNd8JH", 12),
            new ArtPiece("My Heart",
                    "https://drive.google.com/uc?id=1T8appQVsNhS9LSIBB1_MJWQBYafDGP8j", 13),
            new ArtPiece("Release",
                    "https://drive.google.com/uc?id=13rP8Xofe1oIlnjfbEDPnNLTQHolBm9tK", 14),
    };


    /**
     * Returns the piece with the given name in pieces, or throws error if it does not exist.
     * @param name the name of the piece to be returned
     * @return a piece matching the given name
     * @throws Exception if a piece matching the given name is not found.
     */
    public static ArtPiece getPiece(String name) throws Exception {
        for (ArtPiece piece: pieces) {
            if (piece.getName().equalsIgnoreCase(name)) {
                return piece;
            }
        }
        throw new Exception("Piece matching given name:" + name + ", not found in gallery.");
    }






}
