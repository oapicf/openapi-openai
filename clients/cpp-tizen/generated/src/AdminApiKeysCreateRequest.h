/*
 * Admin_api_keys_create_request.h
 *
 * 
 */

#ifndef _Admin_api_keys_create_request_H_
#define _Admin_api_keys_create_request_H_


#include <string>
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

class Admin_api_keys_create_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Admin_api_keys_create_request();
	Admin_api_keys_create_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Admin_api_keys_create_request();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Admin_api_keys_create_request_H_ */
