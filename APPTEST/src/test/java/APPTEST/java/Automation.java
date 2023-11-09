package APPTEST.java;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.base.MythingsBase;
    public class Automation extends  MythingsBase{

	
	    @Test(priority =1)
	    public void testLoginNormal() throws InterruptedException, MalformedURLException {
	        login_normal();
	    }

	    private void login_normal() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =2)
	    public void testUpdate() throws InterruptedException {
	        testUpdate();
	    }

	    @Test(priority =3)
	    public void testLoginGmail() throws InterruptedException {
	        login_normal();
	    }

	    @Test(priority =4)
	    public void testLogoutGmail() throws InterruptedException {
	        logout_Gmail();
	    }

	    private void logout_Gmail() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =5)
	    public void testLoginWithPassword() throws InterruptedException {
	        login_with_password();
	    }

	    private void login_with_password() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =6)
	    public void testCreateProjectConstruction() throws InterruptedException {
	        create_Project_Construction();
	    }

	    private void create_Project_Construction() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =7)
	    public void testCreateProjectEvents() throws InterruptedException {
	        Create_project_Events();
	    }

	    private void Create_project_Events() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =8)
	    public void testCreateProjectTravel() throws InterruptedException {
	        Create_project_Travel();
	    }

	    private void Create_project_Travel() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =9)
	    public void testCreateProjectWork() throws InterruptedException {
	        Create_project_work();
	    }

	    private void Create_project_work() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =10)
	    public void testCreateProjectItem() throws InterruptedException {
	        Create_project_Item();
	    }

	    private void Create_project_Item() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =11)
	    public void testCreateProjectCustomNewCategory() throws InterruptedException {
	        Create_project_Custom_NEW_CATEGORY();
	    }

	    private void Create_project_Custom_NEW_CATEGORY() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =12)
	    public void testCreateItemTransport() throws InterruptedException {
	        create_Item_Transport();
	    }

	    private void create_Item_Transport() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =13)
	    public void testCreateItemProperties() throws InterruptedException {
	        create_Item_Properties();
	    }

	    private void create_Item_Properties() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =14)
	    public void testCreateItemPersonal() throws InterruptedException {
	        create_Item_Personal();
	    }

	    private void create_Item_Personal() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =15)
	    public void testEditItemTransport() throws InterruptedException {
	        Edit_Item_Transport();
	    }

	    private void Edit_Item_Transport() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =16)
	    public void testEditItemProperty() throws InterruptedException {
	        Edit_Item_Property();
	    }

	    private void Edit_Item_Property() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =17)
	    public void testEditItemPersonal() throws InterruptedException {
	        Edit_Item_Personal();
	    }
	
	    private void Edit_Item_Personal() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =18)
	    public void testAddPeopleSearchInviteContact() throws InterruptedException {
	        ADDPEOPLE_Search_People_Invite_CONTACT();
	    }

	    private void ADDPEOPLE_Search_People_Invite_CONTACT() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =19)
	    public void testAddPeopleSearchInviteGmail() throws InterruptedException {
	        ADDPEOPLE_Search_People_Invite_GMAIL();
	    }

	    private void ADDPEOPLE_Search_People_Invite_GMAIL() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =20)
	    public void testAddPeopleCreatePeopleProfileFamily() throws InterruptedException {
	        ADDPEOPLE_Create_People_Profile_FAMILY();
	    }

	    private void ADDPEOPLE_Create_People_Profile_FAMILY() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =21)
	    public void testAddPeopleCreatePeopleProfileFriends() throws InterruptedException {
	        ADDPEOPLE_Create_People_Profile_FRIENDS();
	    }

	    private void ADDPEOPLE_Create_People_Profile_FRIENDS() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =22)
	    public void testEditPeopleProfileFamily() throws InterruptedException {
	        EDITPEOPLE_Edit_People_Profile_FAMILY();
	    }

	    private void EDITPEOPLE_Edit_People_Profile_FAMILY() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =23)
	    public void testEditPeopleProfileFriends() throws InterruptedException {
	        EDITPEOPLE_Edit_People_Profile_FRIENDS();
	    }

	    private void EDITPEOPLE_Edit_People_Profile_FRIENDS() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =24)
	    public void testAddAndEditPeoplePetProfile() throws InterruptedException {
	        ADDPEOPLE_Create_People_Profile_FAMILY();
	        EDITPEOPLE_Edit_Pet_profile();
	    }

	    private void EDITPEOPLE_Edit_Pet_profile() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =25)
	    public void testAddPeopleInviteContact() throws InterruptedException {
	        ADDPEOPLE_Invite_People_invite_CONTACT();
	    }

	    private void ADDPEOPLE_Invite_People_invite_CONTACT() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =26)
	    public void testAddPeopleInviteGmail() throws InterruptedException {
	        ADDPEOPLE_Invite_People_invite_CONTACT();
	    }

	    @Test(priority =27)
	    public void testAddPeopleInvitationLink() throws InterruptedException {
	        ADDPEOPLE_Invite_People_invite_CONTACT();
	    }

	    @Test(priority =28)
	    public void testCreateTaskPersonal() throws InterruptedException {
	        Create_Task_PERSONAL();
	    }

	    private void Create_Task_PERSONAL() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =29)
	    public void testCreateTaskItem() throws InterruptedException {
	        Create_project_Item();
	    }

	    @Test(priority =30)
	    public void testCreateTaskPeople() throws InterruptedException {
	        Create_Task_People();
	    }

	    private void Create_Task_People() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =31)
	    public void testCreateTaskProject() throws InterruptedException {
	        Create_Task_Project();
	    }

	    private void Create_Task_Project() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =32)
	    public void testUploadThroughInbox() throws InterruptedException {
	        Upload_Through_Inbox();
	    }

	    private void Upload_Through_Inbox() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =33)
	    public void testUploadThroughItem() throws InterruptedException {
	        Upload_Through_Item();
	    }

	    private void Upload_Through_Item() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =34)
	    public void testUploadThroughPeople() throws InterruptedException {
	        Upload_Through_People();
	    }

	    @Test(priority =35)
	    public void testUploadThroughArchive() throws InterruptedException {
	        Upload_Through_Archive();
	    }

	    private void Upload_Through_Archive() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =36)
	    public void testDeleteProject() throws InterruptedException {
	        Delete_Project();
	    }

	    private void Delete_Project() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =37)
	    public void testDeleteThings() throws InterruptedException {
	        Delete_Things();
	    }

	    private void Delete_Things() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =38)
	    public void testDeletePeople() throws InterruptedException {
	        Delete_People();
	    }

	    private void Delete_People() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =39)
	    public void testEditDeleteTask() throws InterruptedException {
	        Edit_Delete_Task();
	    }

	    private void Edit_Delete_Task() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =40)
	    public void testUsingTrashRestoreAll() throws InterruptedException {
	        Using_Trash_RestoreAll();
	    }

	    private void Using_Trash_RestoreAll() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =41)
	    public void testThingsArchive() throws InterruptedException {
	        Things_Archive();
	    }

	    private void Things_Archive() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =42)
	    public void testPeopleArchive() throws InterruptedException {
	        people_Archive();
	    }

	    private void people_Archive() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =43)
	    public void testProjectArchive() throws InterruptedException {
	        project_Archive();
	    }

	    private void project_Archive() {
			// TODO Auto-generated method stub
			
		}

		@Test(priority =44)
	    public void testRBArchiveInbox() throws InterruptedException {
	        R_B_Archive_Inbox();
	    }

		private void R_B_Archive_Inbox() {
			// TODO Auto-generated method stub
			
		}
}