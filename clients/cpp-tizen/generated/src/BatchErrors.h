/*
 * Batch_errors.h
 *
 * 
 */

#ifndef _Batch_errors_H_
#define _Batch_errors_H_


#include <string>
#include "Batch_errors_data_inner.h"
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

class Batch_errors : public Object {
public:
	/*! \brief Constructor.
	 */
	Batch_errors();
	Batch_errors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Batch_errors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always `list`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `list`.
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<Batch_errors_data_inner> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Batch_errors_data_inner> data);

private:
	std::string object;
	std::list <Batch_errors_data_inner>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Batch_errors_H_ */
