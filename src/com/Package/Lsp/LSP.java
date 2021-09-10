package com.Package.Lsp;

import com.Package.Lsp.Father;

public class LSP {

    public static void main(String[] args) {
        Father f = new Son();
        Son s = new Son();
        f.reduction("reduction");
        s.reduction("reduction");

        f.enlarge("enlarge");
        s.enlarge("enlarge");
    }

}
