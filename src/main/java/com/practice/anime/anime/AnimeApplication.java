package com.practice.anime.anime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
	}
//
//	@Bean
//	public CommandLineRunner initData(IAnime iAnime, IGenre iGenre, IListAnime iListAnime, IStatus iStatus, IUser iUser) {
//		return (args) -> {
//			UserEntity noe = new UserEntity("Noelia", "123");
//			UserEntity rox = new UserEntity("Roxana", "123");
//			UserEntity david = new UserEntity("David", "123");
//			UserEntity cami = new UserEntity("Camila", "123");
//
//			iUser.save(noe);
//			iUser.save(rox);
//			iUser.save(david);
//			iUser.save(cami);
//
//			GenreEntity shounen = new GenreEntity("SHOUNEN");
//			GenreEntity shoujo = new GenreEntity("SHOUJO");
//			GenreEntity seinen = new GenreEntity("SEINEN");
//			GenreEntity romantic = new GenreEntity("ROMANTIC");
//			GenreEntity comedy = new GenreEntity("COMEDY");
//
//			iGenre.save(shounen);
//			iGenre.save(shoujo);
//			iGenre.save(seinen);
//			iGenre.save(romantic);
//			iGenre.save(comedy);
//
//			StatusEntity planToWatch = new StatusEntity("P");
//			StatusEntity hold = new StatusEntity("H");
//			StatusEntity finish = new StatusEntity("F");
//			StatusEntity watching = new StatusEntity("W");
//			StatusEntity drop = new StatusEntity("D");
//
//
//			iStatus.save(planToWatch);
//			iStatus.save(hold);
//			iStatus.save(finish);
//			iStatus.save(watching);
//			iStatus.save(drop);
//
//
//			AnimeEntity beelzebub = new AnimeEntity("Beelzebub", (long) 60, "https://cdn.myanimelist.net/images/anime/3/28013.jpg");
//			AnimeEntity sakura = new AnimeEntity("Cardcaptor Sakura", (long) 70, "https://cdn.myanimelist.net/images/anime/8/60781.jpg");
//			AnimeEntity mob = new AnimeEntity("Mob Psycho 100", (long) 12, "https://cdn.myanimelist.net/images/anime/8/80356.jpg");
//			AnimeEntity bleach = new AnimeEntity("Bleach", (long) 366, "https://cdn.myanimelist.net/images/anime/3/40451.jpg");
//			AnimeEntity hunter = new AnimeEntity("Hunter x Hunter", (long) 148, "https://cdn.myanimelist.net/images/anime/11/33657.jpg");
//			AnimeEntity loveLive = new AnimeEntity("Love Live! School Idol Project", (long) 13 , "https://cdn.myanimelist.net/images/anime/11/56849.jpg");
//			AnimeEntity kakegurui = new AnimeEntity("Kakegurui", (long) 12, "https://cdn.myanimelist.net/images/anime/3/86578.jpg");
//			AnimeEntity deathNote = new AnimeEntity("Death Note", (long) 37, "https://cdn.myanimelist.net/images/anime/9/9453.jpg");
//
//
//
//
//			beelzebub.addGenre(shounen);
//			beelzebub.addGenre(comedy);
//
//
//			sakura.addGenre(romantic);
//			sakura.addGenre(shoujo);
//
//			mob.addGenre(shounen);
//			mob.addGenre(comedy);
//
//			bleach.addGenre(shounen);
//
//			hunter.addGenre(shounen);
//
//			loveLive.addGenre(comedy);
//
//			kakegurui.addGenre(seinen);
//
//			deathNote.addGenre(seinen);
//
//			iAnime.save(beelzebub);
//			iAnime.save(sakura);
//			iAnime.save(mob);
//			iAnime.save(bleach);
//			iAnime.save(hunter);
//			iAnime.save(loveLive);
//			iAnime.save(kakegurui);
//			iAnime.save(deathNote);
//
//
//
//			ListAnime list_1 = new ListAnime(noe, sakura, finish, (long)70);
//			ListAnime list_2 = new ListAnime(noe, kakegurui, drop, (long)2);
//			ListAnime list_3 = new ListAnime(noe, mob, finish, (long)12);
//			ListAnime list_4 = new ListAnime(noe, bleach, hold, (long)100);
//			ListAnime list_5 = new ListAnime(noe, loveLive, watching, (long)6);
//
//			ListAnime list_6 = new ListAnime(david, hunter, finish, (long)148);
//			ListAnime list_8 = new ListAnime(david, mob, finish, (long)12);
//			ListAnime list_9 = new ListAnime(david, bleach, hold, (long)200);
//			ListAnime list_7 = new ListAnime(david, beelzebub, watching, (long)1);
//
//			ListAnime list_10 = new ListAnime(rox, beelzebub, finish, (long)60);
//			ListAnime list_11 = new ListAnime(rox, hunter, hold, (long)2);
//			ListAnime list_12 = new ListAnime(rox, mob, finish, (long)12);
//
//			ListAnime list_13 = new ListAnime(cami, beelzebub, planToWatch, (long)0);
//			ListAnime list_14 = new ListAnime(cami, hunter, watching, (long)85);
//			ListAnime list_15 = new ListAnime(cami, deathNote, finish, (long)37);
//
//			iListAnime.save(list_1);
//			iListAnime.save(list_2);
//			iListAnime.save(list_3);
//			iListAnime.save(list_4);
//			iListAnime.save(list_5);
//			iListAnime.save(list_6);
//			iListAnime.save(list_7);
//			iListAnime.save(list_8);
//			iListAnime.save(list_9);
//			iListAnime.save(list_10);
//			iListAnime.save(list_11);
//			iListAnime.save(list_12);
//			iListAnime.save(list_13);
//			iListAnime.save(list_14);
//			iListAnime.save(list_15);
//
//		};
//	}
}