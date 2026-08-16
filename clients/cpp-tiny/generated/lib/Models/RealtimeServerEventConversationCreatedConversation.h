
/*
 * RealtimeServerEventConversationCreated_conversation.h
 *
 * The conversation resource.
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventConversationCreated_conversation_H_
#define TINY_CPP_CLIENT_RealtimeServerEventConversationCreated_conversation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The conversation resource.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationCreated_conversation{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventConversationCreated_conversation();
    RealtimeServerEventConversationCreated_conversation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventConversationCreated_conversation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string id{};
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventConversationCreated_conversation_H_ */
