
/*
 * RealtimeServerEventResponseTextDelta.h
 *
 * Returned when the text value of a \&quot;text\&quot; content part is updated.
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseTextDelta_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseTextDelta_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when the text value of a \"text\" content part is updated.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseTextDelta{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseTextDelta();
    RealtimeServerEventResponseTextDelta(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseTextDelta();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique ID of the server event.
	 */
	std::string getEventId();

	/*! \brief Set The unique ID of the server event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `response.text.delta`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.text.delta`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the response.
	 */
	std::string getResponseId();

	/*! \brief Set The ID of the response.
	 */
	void setResponseId(std::string  response_id);
	/*! \brief Get The ID of the item.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the item.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the output item in the response.
	 */
	int getOutputIndex();

	/*! \brief Set The index of the output item in the response.
	 */
	void setOutputIndex(int  output_index);
	/*! \brief Get The index of the content part in the item's content array.
	 */
	int getContentIndex();

	/*! \brief Set The index of the content part in the item's content array.
	 */
	void setContentIndex(int  content_index);
	/*! \brief Get The text delta.
	 */
	std::string getDelta();

	/*! \brief Set The text delta.
	 */
	void setDelta(std::string  delta);


    private:
    std::string event_id{};
    std::string type{};
    std::string response_id{};
    std::string item_id{};
    int output_index{};
    int content_index{};
    std::string delta{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseTextDelta_H_ */
