/*
 * AdminApiKey.h
 *
 * 
 */

#ifndef _AdminApiKey_H_
#define _AdminApiKey_H_


#include <string>
#include "AdminApiKey_owner.h"
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

class AdminApiKey : public Object {
public:
	/*! \brief Constructor.
	 */
	AdminApiKey();
	AdminApiKey(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdminApiKey();

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
	/*! \brief Get 
	 */
	std::string getRedactedValue();

	/*! \brief Set 
	 */
	void setRedactedValue(std::string  redacted_value);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);
	/*! \brief Get 
	 */
	long long getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(long long  created_at);
	/*! \brief Get 
	 */
	AdminApiKey_owner getOwner();

	/*! \brief Set 
	 */
	void setOwner(AdminApiKey_owner  owner);

private:
	std::string object;
	std::string id;
	std::string name;
	std::string redacted_value;
	std::string value;
	long long created_at;
	AdminApiKey_owner owner;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdminApiKey_H_ */
