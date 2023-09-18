These notes are to help show you the main basic important interactions within git, as well as important information regarding git. For the full documentation, see the [Git Reference](https://git-scm.com/docs). Unless you're the one maintaining a repository, there will only be so many of these commands you need to know.
# Interacting with a Git Repository
You should try to use vscode when you can. Only resort to use git bash or windows command prompt whenever you have to. Some computers I've used within UAT have an outdated version of vscode, and you can't use the built in commands to interact with git. You shouldn't have a problem with your own personal computer though.
## Creating a New Repository
1. Make a new repository in your chosen git provider
2. Get the clone link. will look something like ```https://github.com/Dalmontron05/REPO-NAME>.git``` or ```https://ORGANIZATION-NAME@dev.azure.com/ORGANIZATION-NAME/PROJECT-NAME/_git/REPO-NAME```
3. Open a command prompt or git bash
# Tips with Git
## General Workflow
- Run ```git fetch --all``` before working with git commands in a repository. This makes sure git is up to date with the remote repository. Failure to do so may make commands like git status misleading.
### Big Files in Repositories
Github has a maximum file size of 100MiB. For most things like web development that will suffice. However, there are options for your in terms of storing larger files.
#### Git LFS on Github (Large File Storage)
> [**Git LFS is changing their billing plans starting October**](https://github.com/orgs/community/discussions/61362)
I would recommend Git LFS if you plan on having a few big files. Maybe you're have a few adobe documents or zip files.
#### Azure DevOps
Microsoft's Azure lets you have virtually unlimited storage, but not bandwidth. They do recommend repositories stay under 10GiB for performance though. They do have other hard limitations, like only being able to have a repository as private for free users. You are also limited on the amount of collaborators on a project. Azure is alright for small teams building a game.   

You can also use Git LFS on Azure Devops, with free storage.
#### Self Hosting a Git Server
If you don't want to pay to uplift restrictions on hosting providers, and/or want more control of your data, you can host your own server. This does mean you need to setup git on your own personal server. This not only free is an price, it's also free as in freedom.





> Pushing Changes to Github:
git add -A | adds all files from local to repository
git commit -m "<message>" | adds commit message
git push origin <branch> | pushes changes to a git repository

> Pulling Changes from Github:
git pull origin <branch> | pulls latest changes from git repository

> Helpful Info
git diff - shows changes between repository and local
git status - shows changes that will be commited to repository
git branch | shows branches, and which one is selected
git checkout <branch>

