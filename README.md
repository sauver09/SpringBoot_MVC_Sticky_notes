<h1> Sticky Notes</h1>

This project uses the concept of Model Controller View architecture implemented via SpringBoot Framework. 

## Steps to Run:
* Make sure you have following libraries installed

  * mysql
  * Spring tool suite 4 
  

## Structure of important modules of the project:<br> 

<H4> Controller Module </h4>

 ```
@GetMapping("/")
public String viewHomePage(Model model);

@GetMapping("/addStickyNote")
public String addStickyNote(Model model);

@PostMapping("/saveNote")
String saveNote(@ModelAttribute("m_note") Notes m_notes);

@GetMapping("/showFormForUpdate/{id}")
String showFormForUpdate(@PathVariable(value = "id") long id, Model model);

@GetMapping("deleteNote/{id}")
String deleteNote(@PathVariable(value = "id") long id) ;
 
```
  
  
  <h4> Service module </h4>
  
  ```
  public interface NotesService {

	List<Notes> getAllNotes();
	void saveNotes(Notes m_note);
	Notes getNotesById(long id);
	void deleteNoteById(long id);

}

  ```
 
 
 

## Demo Screenshots:

- #### Home Page ####
![alt text](https://github.com/sauver09/SpringBoot_MVC_Sticky_notes/blob/master/screenshots/Image1.png?raw=true)

- #### Adding Sticky Note  ####
![alt text](https://github.com/sauver09/SpringBoot_MVC_Sticky_notes/blob/master/screenshots/Image2.png?raw=true)
![alt text](https://github.com/sauver09/SpringBoot_MVC_Sticky_notes/blob/master/screenshots/Image3.png?raw=true)


- #### Updating a Sticky Note ####
![alt text](https://github.com/sauver09/SpringBoot_MVC_Sticky_notes/blob/master/screenshots/Image4.png?raw=true)

- #### Delete a Sticky Note (by clicking x button ####
![alt text](https://github.com/sauver09/SpringBoot_MVC_Sticky_notes/blob/master/screenshots/Image5.png?raw=true)





