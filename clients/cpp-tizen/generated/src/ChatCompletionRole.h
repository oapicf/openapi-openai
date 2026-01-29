/*
 * ChatCompletionRole.h
 *
 * The role of the author of a message
 */

#ifndef _ChatCompletionRole_H_
#define _ChatCompletionRole_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The role of the author of a message
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRole : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRole();
	ChatCompletionRole(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRole();

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

#endif /* _ChatCompletionRole_H_ */
