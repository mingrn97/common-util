package com.mingrn.wechat.official.domain.reply;

import com.mingrn.wechat.official.domain.BaseMessage;

/**
 * 发送音乐消息
 *
 * @author MinGRn <br > 21/09/2018 17:37
 * @email MinGRn97@gmail.com
 */
public class ReplyMusicMessage extends BaseMessage {

    private MediaMusic Music;

    public MediaMusic getMusic() {
        return Music;
    }

    public void setMusic(MediaMusic music) {
        Music = music;
    }

    public static class MediaMusic {

        /**
         * 音乐标题
         */
        private String Title;

        /**
         * 音乐描述
         */
        private String Description;

        /**
         * 音乐链接
         */
        private String MusicURL;

        /**
         * 高质量音乐链接,WIFI环境优先使用该链接播放音乐
         */
        private String HQMusicUrl;

        /**
         * 缩略图的媒体id,通过素材管理中的接口上传多媒体文件,得到的id
         */
        private String ThumbMediaId;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getMusicURL() {
            return MusicURL;
        }

        public void setMusicURL(String musicURL) {
            MusicURL = musicURL;
        }

        public String getHQMusicUrl() {
            return HQMusicUrl;
        }

        public void setHQMusicUrl(String HQMusicUrl) {
            this.HQMusicUrl = HQMusicUrl;
        }

        public String getThumbMediaId() {
            return ThumbMediaId;
        }

        public void setThumbMediaId(String thumbMediaId) {
            ThumbMediaId = thumbMediaId;
        }

    }
}
