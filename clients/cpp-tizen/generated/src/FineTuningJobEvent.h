/*
 * FineTuningJobEvent.h
 *
 * Fine-tuning job event object
 */

#ifndef _FineTuningJobEvent_H_
#define _FineTuningJobEvent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Fine-tuning job event object
 *
 *  \ingroup Models
 *
 */

class FineTuningJobEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJobEvent();
	FineTuningJobEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJobEvent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always \"fine_tuning.job.event\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"fine_tuning.job.event\".
	 */
	void setObject(std::string  object);
	/*! \brief Get The object identifier.
	 */
	std::string getId();

	/*! \brief Set The object identifier.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) for when the fine-tuning job was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the fine-tuning job was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The log level of the event.
	 */
	std::string getLevel();

	/*! \brief Set The log level of the event.
	 */
	void setLevel(std::string  level);
	/*! \brief Get The message of the event.
	 */
	std::string getMessage();

	/*! \brief Set The message of the event.
	 */
	void setMessage(std::string  message);
	/*! \brief Get The type of event.
	 */
	std::string getType();

	/*! \brief Set The type of event.
	 */
	void setType(std::string  type);
	/*! \brief Get The data associated with the event.
	 */
	std::string getData();

	/*! \brief Set The data associated with the event.
	 */
	void setData(std::string  data);

private:
	std::string object;
	std::string id;
	int created_at;
	std::string level;
	std::string message;
	std::string type;
	std::string data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJobEvent_H_ */
