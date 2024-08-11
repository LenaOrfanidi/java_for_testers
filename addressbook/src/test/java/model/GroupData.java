package model;

import java.util.Objects;

public final class GroupData {

    private final String name;
    private final String header;
    private final String footer;

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public GroupData() {
        this("", "", "");
    }

    public GroupData withName(String name) {
        return new GroupData(name, this.header, this.footer);
    }

    public GroupData withHeader(String header) {
        return new GroupData(this.name, header, this.footer);
    }

    public GroupData withFooter(String footer) {
        return new GroupData(this.name, this.header, footer);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}