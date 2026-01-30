/*
 * RealtimeServerEventConversationCreated_conversation.h
 *
 * The conversation resource.
 */

#ifndef _RealtimeServerEventConversationCreated_conversation_H_
#define _RealtimeServerEventConversationCreated_conversation_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The conversation resource.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationCreated_conversation : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventConversationCreated_conversation();
	RealtimeServerEventConversationCreated_conversation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventConversationCreated_conversation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique ID of the conversation.
	 */
	std::string getId();

	/*! \brief Set The unique ID of the conversation.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, must be `realtime.conversation`.
	 */
	std::string getObject();

	/*! \brief Set The object type, must be `realtime.conversation`.
	 */
	void setObject(std::string  object);

private:
	std::string id;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventConversationCreated_conversation_H_ */
