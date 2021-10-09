
    //Generic Version

	package library;

    import java.util.List;
    import java.util.ArrayList;

    public class BibliothekG<E extends Media> {
        private List<E> resources = new ArrayList<E>();
        
        public void addMedia(E x) {
            resources.add(x);
        }
        
        public E retrieveLast() {
            int size = resources.size();
            if (size > 0) {
                return resources.get(size - 1);
            }
            return null;
        }
        public E get(int index) {
    			return resources.get(index);
        }
        
        interface Media {
        }

        interface Buch extends Media {
        }

        interface Video extends Media {
        }

        interface Zeitung extends Media {
        }
    }
    
