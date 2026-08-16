
/*
 * RealtimeConversationItem_content_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RealtimeConversationItem_content_inner_H_
#define TINY_CPP_CLIENT_RealtimeConversationItem_content_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RealtimeConversationItem_content_inner{
public:

    /*! \brief Constructor.
	 */
    RealtimeConversationItem_content_inner();
    RealtimeConversationItem_content_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeConversationItem_content_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
	 */
	std::string getType();

	/*! \brief Set The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
	 */
	void setType(std::string  type);
	/*! \brief Get The text content, used for `input_text` and `text` content types. 
	 */
	std::string getText();

	/*! \brief Set The text content, used for `input_text` and `text` content types. 
	 */
	void setText(std::string  text);
	/*! \brief Get ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
	 */
	std::string getId();

	/*! \brief Set ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
	 */
	void setId(std::string  id);
	/*! \brief Get Base64-encoded audio bytes, used for `input_audio` content type. 
	 */
	std::string getAudio();

	/*! \brief Set Base64-encoded audio bytes, used for `input_audio` content type. 
	 */
	void setAudio(std::string  audio);
	/*! \brief Get The transcript of the audio, used for `input_audio` content type. 
	 */
	std::string getTranscript();

	/*! \brief Set The transcript of the audio, used for `input_audio` content type. 
	 */
	void setTranscript(std::string  transcript);


    private:
    std::string type{};
    std::string text{};
    std::string id{};
    std::string audio{};
    std::string transcript{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeConversationItem_content_inner_H_ */
