/*
 * Static_Chunking_Strategy.h
 *
 * 
 */

#ifndef _Static_Chunking_Strategy_H_
#define _Static_Chunking_Strategy_H_


#include <string>
#include "Static_Chunking_Strategy_static.h"
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

class Static_Chunking_Strategy : public Object {
public:
	/*! \brief Constructor.
	 */
	Static_Chunking_Strategy();
	Static_Chunking_Strategy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Static_Chunking_Strategy();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `static`.
	 */
	std::string getType();

	/*! \brief Set Always `static`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	Static_Chunking_Strategy_static getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(Static_Chunking_Strategy_static  r_static);

private:
	std::string type;
	Static_Chunking_Strategy_static r_static;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Static_Chunking_Strategy_H_ */
