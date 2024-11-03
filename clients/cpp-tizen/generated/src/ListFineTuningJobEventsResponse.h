/*
 * ListFineTuningJobEventsResponse.h
 *
 * 
 */

#ifndef _ListFineTuningJobEventsResponse_H_
#define _ListFineTuningJobEventsResponse_H_


#include <string>
#include "FineTuningJobEvent.h"
#include <list>
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

class ListFineTuningJobEventsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListFineTuningJobEventsResponse();
	ListFineTuningJobEventsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListFineTuningJobEventsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<FineTuningJobEvent> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTuningJobEvent> data);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);

private:
	std::list <FineTuningJobEvent>data;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListFineTuningJobEventsResponse_H_ */
