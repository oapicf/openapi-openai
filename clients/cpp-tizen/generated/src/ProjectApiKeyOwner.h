/*
 * ProjectApiKey_owner.h
 *
 * 
 */

#ifndef _ProjectApiKey_owner_H_
#define _ProjectApiKey_owner_H_


#include <string>
#include "ProjectServiceAccount.h"
#include "ProjectUser.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectApiKey_owner : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectApiKey_owner();
	ProjectApiKey_owner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectApiKey_owner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	ProjectUser user;
	ProjectServiceAccount service_account;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectApiKey_owner_H_ */
