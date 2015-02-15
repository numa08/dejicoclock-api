(ns dejicoclock-api.background.datasource.fileddatasource
 (:use hickory.core)
 (:require
   [hickory.select :as s]
   ))
(defn data []
  ["<script src=\"http://source.pixiv.net/source/embed.js\" data-id=\"46302970_ff3c83607c717bdd07e39e7b0147022b\" data-size=\"large\" data-border=\"on\" charset=\"utf-8\"></script><noscript><p><a href=\"http://www.pixiv.net/member_illust.php?mode=medium&amp;illust_id=46302970\" target=\"_blank\">ショコラ</a> by <a href=\"http://www.pixiv.net/member.php?id=61767\" target=\"_blank\">なるき</a> on <a href=\"http://www.pixiv.net/\" target=\"_blank\">pixiv</a></p></noscript>"
   "<script src=\"http://source.pixiv.net/source/embed.js\" data-id=\"37284513_57dd7147d145dccdb70f922c628d097b\" data-size=\"large\" data-border=\"off\" charset=\"utf-8\"></script><noscript><p><a href=\"http://www.pixiv.net/member_illust.php?mode=medium&amp;illust_id=37284513\" target=\"_blank\">C84告知１　でじこアンソロ</a> by <a href=\"http://www.pixiv.net/member.php?id=16912\" target=\"_blank\">按図よしひろ</a> on <a href=\"http://www.pixiv.net/\" target=\"_blank\">pixiv</a></p></noscript>"
   "<script src=\"http://source.pixiv.net/source/embed.js\" data-id=\"36558206_315fccaa91261b41692da4cb61f12eae\" data-size=\"large\" data-border=\"off\" charset=\"utf-8\"></script><noscript><p><a href=\"http://www.pixiv.net/member_illust.php?mode=medium&amp;illust_id=36558206\" target=\"_blank\">デ・ジ・キャラット１５周年記念！</a> by <a href= \"http://www.pixiv.net/member.php?id=16912\" target=\"_blank\">按図よしひろ</a> on <a href=\"http://www.pixiv.net/\" target=\"_blank\">pixiv</a></p></noscript>"
   "<script src=\"http://source.pixiv.net/source/embed.js\" data-id=\"41477473_5b40d3494042b0e9009e29fa39a76b8b\" data-size=\"large\" data-border=\"off\" charset=\"utf-8\"></script><noscript><p><a href=\"http://www.pixiv.net/member_illust.php?mode=medium&amp;illust_id=41477473\" target=\"_blank\">でじこっ</a> by <a href=\"http://www.pixiv.net/member.php?id=54995\" target=\"_blank\">すん</a> on <a href=\"http://www.pixiv.net/\" target=\"_blank\">pixiv</a></p></noscript>"
   ])

(defn datasource []
  (map  data)
 [{:data-id "46302970_ff3c83607c717bdd07e39e7b0147022b"
                             :illust {:url "http://www.pixiv.net/member_illust.php?mode=medium&amp;illust_id=46302970" :title "ショコラ"}
                             :author {:url "http://www.pixiv.net/member.php?id=61767" :name "なるき"}
                             }
                            ]
 )

