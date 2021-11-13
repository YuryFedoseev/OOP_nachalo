package domain;

public class peremen {
    private int id; //уникальный индификатор БД
    private int ownerId; // поле из документации, индификатор владельца стены, на которой размещена запись


    //heading,record имеются в классе CommentsInfo, куда лучше убрать?
    // (у ВК есть предвывод одного сообщения, но все комменты видны только войдя в список)
    private String heading; // Тема поста
    private String record; //Текст поста

    private int likeCountPost; // количество поставленных лайков посту
    private boolean likeStatusPost; // Проставлен ли лайк под текущей УЗ к данному посту
    private String likesOwnerPost; //Кто поставил лайк посту

    private int commentCount; // количество комментариев
    private String commentOwner; //Кто поставил комментарий
    private String commentText; //Текст комментария --String если нет возможности загружать файлы/фото


    private int repostCount; //Количество репостов
    private String repostUser; //Кто сделал репост

    private boolean recordIsPinned; //закреплена ли запись в ленте

    private String postDate; //время поста


    private object commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    // + get/set на все поля

    //Пропущенные переменные
    private int fromId; // индификатор владельца стены, с которой скопирована запись
    private int createdBy; // идентификатор администратора, который опубликовал запись
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая.

    private int friendsOnly; // 1, если запись была создана с опцией «Только для друзей».--Почему не boolean?
    private int groupsCanPost; //информация о том, могут ли сообщества комментировать запись;--Почему не boolean?

    private int copyrightID;
    private String copyrightLink;
    private String copyrightName;
    private String copyrightType;

    private int canLike; // информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private int canPublish; // информация о том, может ли текущий пользователь сделать репост записи
    private int userReposted; // наличие репоста от текущего пользователя (1 — есть, 0 — нет).
    private int viewCount; // число просмотров записи


    private String geoType; //тип местоположения
    private String geoCoordinates; //координаты местоположения
    private String geoPlace; // описание места (если оно добавлено)

    private int signerId; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;



    private int canPin; //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelete;//информация о том, может ли текущий пользователь удалить запись
    private int canEdit; //информация о том, может ли текущий пользователь редактировать запись
    private int markedAsAds; //информация о том, содержит ли запись отметку "реклама"

    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя.

    private boolean isDonut; //запись доступна только платным подписчикам VK Donut;
    private int paidDuration;// время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    //почему время в интеджере?
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    private String editMode; //информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    //all — всю информацию о VK Donut.
    //duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.

    //placeholder (object) — заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private int postponedId; //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    private int count; // Количество Инфо
    private boolean canPost; // можно ли писать комменты
    // + get/set на все поля
    private String userName; //Имя комментатора

    //heading,record имеются в классе Post, куда лучше убрать?
    // (у ВК есть предвывод одного сообщения, но все комменты видны только войдя в список)
    private String heading; // Тема поста
    private String record; //Текст поста

    private String commentDate; //время комментария

    private int likeCountComment; // количество поставленных лайков комментарию
    private boolean likeStatusComment; // Проставлен ли лайк под текущей УЗ комментарию
    private String likesOwnerComment; //Кто поставил лайк комментарию

    //Пропущенные переменные
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи.

    private boolean registeredUser; // Зарегистрирован ли пользователь

    private String userName; //Имя пользователя
    private String userSurname; //Фамилия пользователя
    private String userPatronymic; //Отчество пользователя
    private String userLogin; //Логин пользователя

    private int userPhoneNumber; // Телефон  пользователя
    private String userMail; // Почта пользователя
    private String userPassword; // Пароль пользователя

    private String userBirthday; //День рождения пользователя

}
