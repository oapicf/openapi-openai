/*
 * RealtimeClientEventResponseCreate.h
 *
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only. 
 */

#ifndef _RealtimeClientEventResponseCreate_H_
#define _RealtimeClientEventResponseCreate_H_


#include <string>
#include "RealtimeResponseCreateParams.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventResponseCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventResponseCreate();
	RealtimeClientEventResponseCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventResponseCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Optional client-generated ID used to identify this event.
	 */
	std::string getEventId();

	/*! \brief Set Optional client-generated ID used to identify this event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `response.create`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.create`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RealtimeResponseCreateParams getResponse();

	/*! \brief Set 
	 */
	void setResponse(RealtimeResponseCreateParams  response);

private:
	std::string event_id;
	std::string type;
	RealtimeResponseCreateParams response;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeClientEventResponseCreate_H_ */
