/*
 * FineTuneEvent.h
 *
 * 
 */

#ifndef _FineTuneEvent_H_
#define _FineTuneEvent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FineTuneEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneEvent();
	FineTuneEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneEvent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
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

private:
	std::string object;
	int created_at;
	std::string level;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneEvent_H_ */
