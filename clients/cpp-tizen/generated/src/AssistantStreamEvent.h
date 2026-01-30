/*
 * AssistantStreamEvent.h
 *
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 */

#ifndef _AssistantStreamEvent_H_
#define _AssistantStreamEvent_H_


#include <string>
#include "DoneEvent.h"
#include "ErrorEvent.h"
#include "MessageStreamEvent.h"
#include "RunStepStreamEvent.h"
#include "RunStreamEvent.h"
#include "ThreadStreamEvent.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 *
 *  \ingroup Models
 *
 */

class AssistantStreamEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantStreamEvent();
	AssistantStreamEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantStreamEvent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether to enable input audio transcription.
	 */
	bool getEnabled();

	/*! \brief Set Whether to enable input audio transcription.
	 */
	void setEnabled(bool  enabled);
	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);

private:
	bool enabled;
	std::string event;
	std::string data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantStreamEvent_H_ */
