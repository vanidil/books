    package com.libraries.books.model;

    public class Book {
         public Book() {
         }
        public Book(Integer id, String title, String author, String isbn) {
            super();
            this.id = id;
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
        private Integer id;
        private String title;
        private String author;
        private String isbn;

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        @Override
        public String toString() {
            return "Book [id=" + id + ", title=" + title
                    + ", author=" + author + ", isbn=" + isbn + "]";
        }
    }
