/*
 * ListFineTuneEventsResponse.h
 *
 * 
 */

#ifndef _ListFineTuneEventsResponse_H_
#define _ListFineTuneEventsResponse_H_


#include <string>
#include "FineTuneEvent.h"
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

class ListFineTuneEventsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListFineTuneEventsResponse();
	ListFineTuneEventsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListFineTuneEventsResponse();

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
	std::list<FineTuneEvent> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTuneEvent> data);

private:
	std::string object;
	std::list <FineTuneEvent>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListFineTuneEventsResponse_H_ */
