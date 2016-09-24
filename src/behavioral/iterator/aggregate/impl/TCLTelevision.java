package behavioral.iterator.aggregate.impl;

import behavioral.iterator.aggregate.Television;
import behavioral.iterator.TVIterator;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class TCLTelevision implements Television {

    private String[] channels = {"湖南卫视", "北京卫视", "上海卫视", "湖北卫视", "黑龙江卫视"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TVIterator {

        private int currentIndex = 0;

        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public void next() {
            if (currentIndex < channels.length) {
                ++currentIndex;
            }
        }

        @Override
        public void previous() {
            if (currentIndex > 0) {
                --currentIndex;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex == channels.length - 1;
        }

        @Override
        public Object currentChannel() {
            return channels[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }
    }
}
