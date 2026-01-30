/*
 * AuditLog_api_key_created.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_api_key_created_H_
#define _AuditLog_api_key_created_H_


#include <string>
#include "AuditLog_api_key_created_data.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_api_key_created : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_api_key_created();
	AuditLog_api_key_created(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_api_key_created();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The tracking ID of the API key.
	 */
	std::string getId();

	/*! \brief Set The tracking ID of the API key.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLog_api_key_created_data getData();

	/*! \brief Set 
	 */
	void setData(AuditLog_api_key_created_data  data);

private:
	std::string id;
	AuditLog_api_key_created_data data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_api_key_created_H_ */
