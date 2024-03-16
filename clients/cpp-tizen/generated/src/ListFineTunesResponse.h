/*
 * ListFineTunesResponse.h
 *
 * 
 */

#ifndef _ListFineTunesResponse_H_
#define _ListFineTunesResponse_H_


#include <string>
#include "FineTune.h"
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

class ListFineTunesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListFineTunesResponse();
	ListFineTunesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListFineTunesResponse();

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
	std::list<FineTune> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTune> data);

private:
	std::string object;
	std::list <FineTune>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListFineTunesResponse_H_ */
