package com.art.restservice;

/**
 * Represents a collection of art pieces.
 */
public final class Gallery {

    /**
     * Represents all pieces in this gallery.
     */
    public static final ArtPiece[] pieces = new ArtPiece[]{
            new ArtPiece("I Can Change",
                    "https://drive.google.com/uc?id=10mpBkVcWxY_kWoXXK6o8uYjKru2swWy2"),
            new ArtPiece("Where Have You Been?",
                    "https://drive.google.com/uc?id=1fL1ZkiTxEpP6LW-lRkP9D92HqOnhi-tK"),
            new ArtPiece("Breathe in the Present",
                    "https://drive.google.com/uc?id=1HrHlhBGF7Y6uzYJwmlLyXhqQQ_kaM0cH"),
            new ArtPiece("Feminine Expectations",
                    "https://drive.google.com/uc?id=1CAfHy1ZfHvRpYNG9O-kXADsPcOhTQUq-"),
            new ArtPiece("Womanhood",
                    "https://drive.google.com/uc?id=1xWd2eH0eMGXJOv4jaoGwLgwvls0e9fNd"),
            new ArtPiece("Trusting You",
                    "https://drive.google.com/uc?id=1d-LXD5d569vMgKmYf6awNaP_rz1wp27c"),
            new ArtPiece("Through",
                    "https://drive.google.com/uc?id=1nla49eH2WArQ3EQEKCGSSxbhUBov6Ii7"),
            new ArtPiece("The Eye",
                    "https://drive.google.com/uc?id=1VjDAQCi623ZG7w88m0vVhXObSCWyM8up"),
            new ArtPiece("The Ear",
                    "https://drive.google.com/uc?id=1dLJ4RlC2F_FdA4YazpMXPjXKemJtH3mm"),
            new ArtPiece("Still-Life",
                    "https://drive.google.com/uc?id=1ECLAZ5vPgd6UztFgojm0pNVh0h1EBQRD"),
            new ArtPiece("Self Portrait 2020",
                    "https://drive.google.com/uc?id=1L-e28HJnaDveW_i_F3A6ImUPZ_PSadmv"),
            new ArtPiece("Little Girl",
                    "https://drive.google.com/uc?id=1qfX92Jys9bMrqCQXLNzggVvmlfueAkpQ"),
            new ArtPiece("Little Girl II",
                    "https://drive.google.com/uc?id=1He8AlTIztNmcccWivBrtw4hcM8lOEK3Q"),
            new ArtPiece("July",
                    "https://drive.google.com/uc?id=1lCGQt1TBrJuGO-zpl09eY7VDZ1Y3qURL"),
            new ArtPiece("For Rachel",
                    "https://drive.google.com/uc?id=1UXQkDojMwatHs7pYIrSxeAg95w5KBmJd"),
            new ArtPiece("All Over Now",
                    "https://drive.google.com/uc?id=1G9KcpaI4zRBPc7P6nSbFCAN4pfWNd8JH"),
            new ArtPiece("My Heart",
                    "https://drive.google.com/uc?id=1T8appQVsNhS9LSIBB1_MJWQBYafDGP8j"),
            new ArtPiece("Release",
                    "https://drive.google.com/uc?id=13rP8Xofe1oIlnjfbEDPnNLTQHolBm9tK"),
    };


    /**
     * Returns the piece with the given name in pieces, or throws error if it does not exist.
     * @param name the name of the piece to be returned
     * @return a piece matching the given name
     * @throws Exception if a piece matching the given name is not found.
     */
    public static ArtPiece getPieceByName(String name) throws Exception {
        for (ArtPiece piece: pieces) {
            if (piece.getName().equalsIgnoreCase(name)) {
                return piece;
            }
        }
        throw new Exception("Piece matching given name:" + name + ", not found in gallery.");
    }

    /**
     * Returns the piece with the given id, or throws an error if it does not exist.
     * @param id - the id of the piece to be returned
     * @return a piece matching the given id
     * @throws Exception - if a piece matching the given id does not exist
     */
    public static ArtPiece getPieceById(long id) throws Exception {
        if(pieces.length >= id)
            throw new Exception("Piece matching given id:" + id + ", not found in gallery.");
        else {
            for (ArtPiece piece : pieces) {
                if (piece.getId() == id) {
                    return piece;
                }
            }
        }
        throw new Exception("Piece matching given id:" + id + ", not found in gallery.");

    }






}
