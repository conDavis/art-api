package com.art.restservice;

/**
 * Represents a unique work of art.
 */
public class ArtPiece {
    private final String name;
    private final String url;
    private final long id;
    private static long nextId = 0;


    /**
     * Constructs an ArtPiece with the given attributes.
     * @param name the name of the piece
     * @param url the url where the content of the piece is hosted
     * @param id the unique id of the piece
     */
    ArtPiece(String name, String url) {
        this.name = name;
        this.url = url;
        this.id = this.nextId;
        this.nextId ++;

    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public long getId() {
        return this.id;
    }


}
