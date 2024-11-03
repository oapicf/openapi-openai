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

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	std::string getLevel();

	/*! \brief Set 
	 */
	void setLevel(std::string  level);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);

private:
	std::string id;
	int created_at;
	std::string level;
	std::string message;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJobEvent_H_ */
