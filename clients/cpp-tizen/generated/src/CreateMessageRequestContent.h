/*
 * CreateMessageRequest_content.h
 *
 * 
 */

#ifndef _CreateMessageRequest_content_H_
#define _CreateMessageRequest_content_H_


#include <string>
#include "Array_of_content_parts_inner.h"
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

class CreateMessageRequest_content : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMessageRequest_content();
	CreateMessageRequest_content(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMessageRequest_content();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMessageRequest_content_H_ */
