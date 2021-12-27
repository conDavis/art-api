package com.art.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GalleryController {

    /**
     *
     * @return random piece out of gallery pieces.
     */
    @ResponseBody
    @GetMapping( "/random")
    public ArtPiece artPiece() {
        return Gallery.pieces[(int)Math.random()*13];
    }

    /**
     * 
     * @return all gallery pieces.
     */
    @ResponseBody
    @GetMapping("/all")
    public ArtPiece[] allPieces() {
        return Gallery.pieces;
    }


}
