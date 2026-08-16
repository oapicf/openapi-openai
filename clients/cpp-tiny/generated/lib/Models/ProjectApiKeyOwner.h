
/*
 * ProjectApiKey_owner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectApiKey_owner_H_
#define TINY_CPP_CLIENT_ProjectApiKey_owner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProjectServiceAccount.h"
#include "ProjectUser.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectApiKey_owner{
public:

    /*! \brief Constructor.
	 */
    ProjectApiKey_owner();
    ProjectApiKey_owner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectApiKey_owner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get `user` or `service_account`
	 */
	std::string getType();

	/*! \brief Set `user` or `service_account`
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ProjectUser getUser();

	/*! \brief Set 
	 */
	void setUser(ProjectUser  user);
	/*! \brief Get 
	 */
	ProjectServiceAccount getServiceAccount();

	/*! \brief Set 
	 */
	void setServiceAccount(ProjectServiceAccount  service_account);


    private:
    std::string type{};
    ProjectUser user;
    ProjectServiceAccount service_account;
};
}

#endif /* TINY_CPP_CLIENT_ProjectApiKey_owner_H_ */
