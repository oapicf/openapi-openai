/*
 * ThreadStreamEvent.h
 *
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */

#ifndef _ThreadStreamEvent_H_
#define _ThreadStreamEvent_H_


#include <string>
#include "ThreadObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 *
 *  \ingroup Models
 *
 */

class ThreadStreamEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	ThreadStreamEvent();
	ThreadStreamEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ThreadStreamEvent();

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
	ThreadObject getData();

	/*! \brief Set 
	 */
	void setData(ThreadObject  data);

private:
	bool enabled;
	std::string event;
	ThreadObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ThreadStreamEvent_H_ */
