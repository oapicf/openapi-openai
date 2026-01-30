/*
 * RealtimeResponseCreateParams_conversation.h
 *
 * Controls which conversation the response is added to. Currently supports &#x60;auto&#x60; and &#x60;none&#x60;, with &#x60;auto&#x60; as the default value. The &#x60;auto&#x60; value means that the contents of the response will be added to the default conversation. Set this to &#x60;none&#x60; to create an out-of-band response which  will not add items to default conversation. 
 */

#ifndef _RealtimeResponseCreateParams_conversation_H_
#define _RealtimeResponseCreateParams_conversation_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponseCreateParams_conversation : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponseCreateParams_conversation();
	RealtimeResponseCreateParams_conversation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponseCreateParams_conversation();

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

#endif /* _RealtimeResponseCreateParams_conversation_H_ */
