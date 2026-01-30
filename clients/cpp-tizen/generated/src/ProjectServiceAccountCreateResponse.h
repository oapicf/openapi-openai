/*
 * ProjectServiceAccountCreateResponse.h
 *
 * 
 */

#ifndef _ProjectServiceAccountCreateResponse_H_
#define _ProjectServiceAccountCreateResponse_H_


#include <string>
#include "ProjectServiceAccountApiKey.h"
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

class ProjectServiceAccountCreateResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectServiceAccountCreateResponse();
	ProjectServiceAccountCreateResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectServiceAccountCreateResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get Service accounts can only have one role of type `member`
	 */
	std::string getRole();

	/*! \brief Set Service accounts can only have one role of type `member`
	 */
	void setRole(std::string  role);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	ProjectServiceAccountApiKey getApiKey();

	/*! \brief Set 
	 */
	void setApiKey(ProjectServiceAccountApiKey  api_key);

private:
	std::string object;
	std::string id;
	std::string name;
	std::string role;
	int created_at;
	ProjectServiceAccountApiKey api_key;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectServiceAccountCreateResponse_H_ */
